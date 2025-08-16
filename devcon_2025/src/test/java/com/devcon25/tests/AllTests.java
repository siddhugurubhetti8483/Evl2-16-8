package com.devcon25.tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AllTests extends BaseTest {
    @Test(priority = 1)
    void pageload() throws InterruptedException{
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(5000);
        Assert.assertEquals(driver.getTitle(),"OrangeHRM");

        // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    @Test(priority = 2)
    void login() throws InterruptedException{
        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

    @Test(priority = 3)
    void dropdown() throws InterruptedException{

        Thread.sleep(2000);
        driver.findElement(By.linkText("Recruitment")).click();
        
    }
}
