package com.xia;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * @author xia
 * @create 2021-05-14 10:04
 */
public class test_baidu {
    @BeforeClass
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\AppData\\Local\\Google\\Chrome\\Application\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://baidu.com");
        driver.close();
    }

    @AfterClass
    public void tearup(){
        System.out.println("这是模块A结束");
    }

    @Test
    public void test1(){
        System.out.println("这是用例1");
    }
}
