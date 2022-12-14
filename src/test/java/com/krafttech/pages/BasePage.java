package com.krafttech.pages;

import com.krafttech.utilities.BrowserUtils;
import com.krafttech.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {

    WebDriver driver;


    public BasePage() {
        PageFactory.initElements(Driver.get(),this);
    }

    public void navigateToTab(String tabName){

            driver=Driver.get();
            driver.findElement(By.xpath("//nav//span[.='"+tabName+"']")).click();

        }


    public void navigateToModule(String tab, String module){

        String tabLocator= "//li[@class='nav-item']//span[.='"+tab+"']";  ////li[@class='nav-item']//span[.='Components']

        String moduleLocator="//span[.='"+module+"']";

        driver=Driver.get();

        BrowserUtils.waitForClickablility(By.xpath(tabLocator),5);
        WebElement tabElement=driver.findElement(By.xpath(tabLocator));
        tabElement.click();

        BrowserUtils.waitForClickablility(By.xpath(moduleLocator),5);
        driver.findElement(By.xpath(moduleLocator)).click();

    }

    public void navigateToModule(String menuName){

    }
    public String subTitle(String subTitle){
        String subTitleLocator="//h1[.='"+subTitle+"']";
        BrowserUtils.waitForPresenceOfElement(By.xpath(subTitleLocator),5);
        WebElement SubTitle = Driver.get().findElement(By.xpath(subTitleLocator));

        String actualSubTitle= SubTitle.getText();
        return actualSubTitle;

    }

    public String getAccountName_mtd(String accountName){
        return Driver.get().findElement(By.xpath("//span[.='"+accountName+"']")).getText();
    }

    public void Assertion(WebElement actual, String expected){

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(actual));
        Assert.assertEquals(actual.getText(), expected);
        System.out.println("My messsage: " + actual.getText());
    }

}
