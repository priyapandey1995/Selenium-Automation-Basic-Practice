package com.bridgelabz.qa.seleniumconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class LocatorsDemo extends BaseClass {

    @Test
    public void locatorsDemo() throws InterruptedException, IOException {
        driver.get("https://bldev.bridgelabz.com/webinar");
        WebElement PhoneNumber = driver.findElement(By.id("deftphnumber"));
        PhoneNumber.sendKeys("8884327526");

        driver.findElement(By.tagName("input"));

        driver.findElement(By.name("email")).sendKeys("priyapandey8884.blr@gmail.com");

        driver.findElement(By.cssSelector("input#deftusername")).sendKeys("priya");

        WebElement element = driver.findElement(By.xpath("/html/body/section[1]/div/div[6]/div[2]/div[2]/div[2]/div/input"));
        Thread.sleep(200);
        element.sendKeys(Keys.PAGE_DOWN);
        Thread.sleep(200);
        element.click();

        driver.findElement(By.xpath("//*[@id=\"deftyear\"]")).getText();
        driver.findElement(By.className("anchor-tag")).click();

        String title = driver.getTitle();
        Assert.assertEquals("BridgeLabz: Guaranteed Emerging Tech Job", title);
        takeScreenshots();

         //driver.get("https://www.facebook.com/");
         //driver.findElement(By.linkText("Create New Account")).click();
         // driver.findElement(By.partialLinkText("Forgotten password")).click();

    }
}
