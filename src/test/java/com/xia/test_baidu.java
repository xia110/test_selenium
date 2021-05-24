package com.xia;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * @author xia
 * @create 2021-05-14 10:04
 */
public class test_baidu {
    @Test(description = "进入百度页面")
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\AppData\\Local\\Google\\Chrome\\Application\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://baidu.com");
        Reporter.log("测试日志");
        Assert.assertTrue(true);
        driver.close();
    }

    @Test(description = "错误")
    public void test1(){
        Assert.fail("错误");
    }

    @Test(description = "错误")
    public void test2(){
        Assert.assertTrue(true);
    }
}
