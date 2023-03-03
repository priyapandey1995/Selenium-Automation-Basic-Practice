package com.bridgelabz.qa.seleniumconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class FacebookSelect extends BaseClass {

    @Test(priority = 2)
    public void NavigateOnFbSignUpPage_Success() throws IOException {
        driver.navigate().to("https://www.facebook.com/");
        String title = driver.getTitle();
        Assert.assertEquals(title,"Facebook – log in or sign up");
        takeScreenshots();

    }

    @Test(priority = 1)
    public void SignUpFbPage_Success() throws InterruptedException, IOException {
        driver.get("https://www.facebook.com/");
        WebElement link = driver.findElement(By.partialLinkText("Create"));
        link.click();
        Thread.sleep(2000);
        takeScreenshots();

        WebElement name = driver.findElement(By.xpath("//input[@type='text'][@placeholder='First name']"));
        name.sendKeys("Priya");
        Thread.sleep(2000);


        WebElement lastname = driver.findElement(By.xpath("//input[@type='text'][@name='lastname']"));
        lastname.sendKeys("Pandey");
        Thread.sleep(2000);

        WebElement mobile = driver.findElement(By.xpath("//input[@type='text'][@name='reg_email__']"));
        mobile.sendKeys("8884327526");
        Thread.sleep(2000);

        WebElement newPassword = driver.findElement(By.xpath("//input[@id='password_step_input'][@type='password']"));
        newPassword.sendKeys("Pandey");
        Thread.sleep(3000);

        WebElement day = driver.findElement(By.xpath("//select[@id='day'][@class='_9407 _5dba _9hk6 _8esg']"));
        day.sendKeys("18");
        Thread.sleep(3000);

        WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
        month.sendKeys("july");
        Thread.sleep(3000);

        WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
        year.sendKeys("1995");
        Thread.sleep(3000);

        WebElement female = driver.findElement(By.xpath("//label[text()='Female']"));
        female.click();
        Thread.sleep(3000);

        WebElement sign = driver.findElement(By.xpath("//button[text()='Sign Up']"));
        sign.click();
        Thread.sleep(3000);
    }
    }



