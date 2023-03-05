package com.bridgelabz.qa.seleniumconcepts;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class JavaScriptExecutor extends BaseClass{
    @Test
    public void execute() throws InterruptedException {
        driver.get("https://www.guru99.com/api-testing.html");

        JavascriptExecutor executor = (JavascriptExecutor) driver;
        System.out.println("Execute script: " + executor.executeScript("return window.length"));

        int noOfFrames = Integer.parseInt(executor.executeScript("return window.length").toString());
        System.out.println("No of Frames: " + noOfFrames);

        executor.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(500);
    }
}

