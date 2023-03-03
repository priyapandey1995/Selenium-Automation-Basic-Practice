package com.bridgelabz.qa.seleniumconcepts;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LinkedinFrameHandlings{

    @Test
    public void signUp_Page() throws InterruptedException {

        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.linkedin.com/home");

        WebElement link= driver.findElement(By.xpath("//a[@class='nav__button-tertiary btn-md btn-tertiary']"));
        link.click();

        WebElement mobile = driver.findElement(By.xpath("//input[@placeholder='Email or phone number']"));
        mobile.sendKeys("7337716317");
        Thread.sleep(3000);

        WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys("7337716317");

        WebElement btn = driver.findElement(By.xpath("//button[@id='join-form-submit']"));
        btn.click();

        WebElement firstName=driver.findElement(By.xpath("//input[@placeholder='First name']"));
        firstName.sendKeys("Adasrh");

        WebElement lastName=driver.findElement(By.xpath("//input[@placeholder='Last name']"));
        lastName.sendKeys("pandey");

        WebElement clickButton  = driver.findElement(By.id("join-form-submit"));

        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", clickButton);

        executor.executeScript("alert('Welcome on Frame');");

        //total numbers of Iframe present in the webpage
        int size = driver.findElements(By.tagName("iframe")).size();
        System.out.println("Frame size "+ size);

        //finding out the index of frame
        for (int i=0; i<=size; i++){
            driver.switchTo().frame(i);
            int total = driver.findElements(By.xpath("//iframe[@src='/checkpoint/challengeIframe/AQEbZC2s7YY6pgAAAYadr0VlaVu1JZr6UAjdu3l7BlQsUlTvDPcgKSBJx-B9zSGUGgknvwIwxV6c38TkNzsAku5U6Vt38A?ut=0OdOEr-O8zGaE1']")).size();
            System.out.println(total);
            driver.findElement(By.name("phoneNumber")).sendKeys("7337716317");
            driver.switchTo().defaultContent();
            Thread.sleep(1000);
        }

//        WebElement button = driver.findElement(By.xpath("//button[text()='Continue']"));
//        button.click();
//
//
//        WebElement box = driver.findElement(By.xpath("//section[@class='challenge-dialog ']"));
//
//        Alert alert = driver.switchTo().alert();
//        WebElement verify = driver.findElement(By.xpath("//button[@id='join-form-submit']"));
//        verify.click();
//        Thread.sleep(5000);
//        alert.accept();
    }
}
