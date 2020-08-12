package com.octopusgroup.utility;

import com.octopusgroup.basepage.BasePage;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UtilMethods extends BasePage {

    //This method will click on an element
    public void clickOnElement(WebElement element) {
        element.click();
    }

    //This method will get text from an element
    public String getTextFromElement(WebElement element) {

        return element.getText();
    }

    //This method will send text to the element
    public void sendTextToElement(WebElement element, String str) {

        element.sendKeys(str);
    }

    //This method will do mouse hover on an element
    public void mouseHoverToElement(WebElement element) {
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();
    }

    //These method will help select from drop down menu
    public void selectByVisibleTextFromDropDown(WebElement element, String str) {
        Select select = new Select(element);
        select.selectByVisibleText(str);
    }

    public void selectByIndexFromDropDown(WebElement element, int index) {
        Select select = new Select(element);
        select.selectByIndex(index);
    }

    public void selectByValueFromDropDown(WebElement element, String value) {
        Select select = new Select(element);
        select.selectByValue(value);
    }
    //AlertMethods
    public void alertDismiss() {
        Alert alert = driver.switchTo().alert();
        alert.dismiss();
    }

    public void alertGetText() {
        Alert alert = driver.switchTo().alert();
        alert.getText();
    }

    public void alertAccept() {
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }


    //This method will help verify the text
    public void verifyText(WebElement element, String str) {
        Assert.assertEquals(element.getText(), str);
    }

    public static String currentTimeStamp() {
        Date d = new Date();
        return d.toString().replace(":", "_").replace(":", "_");
    }



    /*
     * This method will take the screenshot and add to screenshot folder
     * This method will required parameter like screenshot name and return destination path
     *
     * @parameter driver
     * @parameter screenshotName
     * @return type method
     */
    public static String getScreenshot(WebDriver driver, String screenshotName) {
        String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);

        // After execution, you could see a folder "FailedTestsScreenshots" under screenshot folder
        String destination = System.getProperty("user.dir") + "\\src\\main\\java\\com\\octopusgroup\\screenshots\\" + screenshotName + dateName + ".png";
        File finalDestination = new File(destination);
        try {
            FileUtils.copyFile(source, finalDestination);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return destination;
    }

    //Explicit wait for an element to be clickable
    public void waitUntilElementToBeClickable(WebElement element, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }
}
