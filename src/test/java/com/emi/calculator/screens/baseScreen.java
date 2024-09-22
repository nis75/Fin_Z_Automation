package com.emi.calculator.screens;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class baseScreen extends screen{
    public baseScreen(AndroidDriver driver) {
        super(driver);
    }

    @Override
    public String getPageTittle() {
        return driver.getTitle();
    }

    @Override
    public WebElement getWebElement(By locator) {
        WebElement element = null;
        try {
            element = driver.findElement(locator);
        }catch (Exception e){
            System.out.println(locator.toString()+"Select or locator not Found");
        }
        return element;
    }

    @Override
    public List<WebElement> getWebElements(By locator) {
        List<WebElement>elements=null;
        try {
            elements = driver.findElements(locator);
        }catch (Exception e){
            System.out.println(locator.toString()+"Select or locator not Found");
        }
        return elements;
    }

    @Override
    public void waitForElement(By locator) {
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        }catch (Exception e){
            System.out.println(locator.toString()+"Select or locator not Found");
        }

    }
}
