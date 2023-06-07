package com.myapp.tests.listeners;

import com.myapp.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class ListenersTest3 {
    /*
    If a test case fails, then test case will run again by the help of Listeners retry method.
    The method below fails, but it will rerun automatically. We are able to rerun failed test cases multiple times
    by using retryAnalyzer on test NG.
    In this class we connect test class with retryAnalyzer by  @Test(retryAnalyzer = com.myapp.utilities.ListenersUtil.class) annotation.
    To connect test class with retryAnalyzer is possible also with xml file...
     */

    @Test(retryAnalyzer = com.myapp.utilities.ListenersUtil.class)
    public void test4() {
        System.out.println("FAIL --> Exception--> Test 4");
//        Driver.getDriver().get("https://google.com");
//        Driver.getDriver().findElement(By.id("wrong id"));//--> NoSuchElementException
        throw new NoSuchElementException("No such element!!!");
    }

    @AfterMethod
    public void tearDown() {
        Driver.closeDriver();
    }

}
