package com.octopusgroup.basepage;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public static WebDriver driver;

    //Constructor
    public BasePage() {
        //This is for pagefactory approach to intialize page objects
        PageFactory.initElements(driver, this);

        //This is to configure logger from log4j property file for genearating log folder giving the log report
        PropertyConfigurator.configure(System.getProperty("user.dir") + "\\src\\test\\java\\com\\octopusgroup\\resources\\properties\\log4j.properties");
    }
}
