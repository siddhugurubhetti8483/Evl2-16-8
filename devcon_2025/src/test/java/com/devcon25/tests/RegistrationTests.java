package com.devcon25.tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegistrationTests extends BaseTest{
    @Test(priority = 1)
    void pageload(){
        driver.get("https://rahulshettyacademy.com/loginpagePractise/");
        Assert.assertEquals(driver.getTitle(),"LoginPage Practise | Rahul Shetty Academy");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    @Test(priority = 2)
    void formFillingTest(){
        driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
        driver.findElement(By.id("password")).sendKeys("learning");

        // Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\'login-form\']/div[4]/div/label[1]/span[2]")).isSelected());

        driver.findElement(By.id("terms")).click();
        driver.findElement(By.id("signInBtn")).click();
    }

}
