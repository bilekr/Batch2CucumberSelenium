package com.krafttech.pages;

import com.krafttech.utilities.BrowserUtils;
import com.krafttech.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProfilePage extends BasePage {



        @FindBy(xpath = "//button[.='Edit Profile'] ")
        public WebElement editBtn;

        @FindBy(css = "#name")
        public WebElement fullName;

        @FindBy(css = "#about")
        public WebElement about;

        @FindBy(xpath = "(//input[@id='company'])[1]")
        public WebElement company;

        @FindBy(css = "#terms")
        public WebElement slider;

        @FindBy(css = ".form-select")
        public WebElement job;

        @FindBy(xpath = "//input[@id='website']")
        public WebElement website;

        @FindBy(xpath = "(//input[@id='location'])[1]")
        public WebElement location;

        @FindBy(xpath = "//input[@id='skills']")
        public WebElement skills;

        @FindBy(xpath = "//button[.='Save Changes']")
        public WebElement save;

        @FindBy(xpath = "//div[@class='alert alert-success bg-success text-light border-0 alert-dismissible fade show']")
        public WebElement profileUpdate;

        @FindBy(xpath = "//a[@class='nav-link collapsed']")
        public List<WebElement> profileOptions;


        public void profileTabs(String tabName){

            String tabLocator= "//button[.='"+tabName+"']";

            BrowserUtils.waitForClickablility(By.xpath(tabLocator),5);
            WebElement tabElement= Driver.get().findElement(By.xpath(tabLocator));
            tabElement.click();
        }

        @FindBy(xpath = "//input[@placeholder='Job Title *']")
        public WebElement jobTitle;

        @FindBy(xpath = "//input[@placeholder='Company *']")
        public WebElement companyexperience;

        @FindBy(xpath = "//input[@placeholder='Location'] ")
        public WebElement locationExperience;

        @FindBy(xpath = "(//input[@placeholder='From Date'])[1]")
        public WebElement startYear;

        @FindBy(xpath = "(//input[@placeholder='To Date '])[1]")
        public WebElement endYear;

        @FindBy(xpath = "//textarea[@placeholder='Job Description']")
        public WebElement jobDescription;

        @FindBy(xpath = "//button[@value='experience']")
        public WebElement addExperienceBtn;

        @FindBy(xpath = "//input[@id='email']")
        public WebElement profilEmail_loc;

        @FindBy(xpath = "(//span[.='My Profile'])[2]")
        public WebElement myProfileBtn;

        @FindBy (xpath = "//div[@class='alert alert-success bg-success text-light border-0 alert-dismissible fade show']")
        public WebElement profileUpdatemsg;

    }


