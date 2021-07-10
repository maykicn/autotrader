package com.autotrader.pages;

import com.autotrader.utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class AdvanceSearchPage extends HomePage {

    @FindBy(xpath = "//input[@id='zip']")
    public WebElement advanceSearchPageTextBox;

    @FindBy(xpath = "//div[contains(text(),'Manufacturer Certified')]")
    public WebElement manufacturerCertifiedChBox;

    @FindBy(xpath = "//div[contains(text(),'Convertible')]")
    public WebElement convertibleChBox;

    @FindBy(xpath = "//select[@id='4101482096']")
    public WebElement fromYear;

    @FindBy(xpath = "//select[@id='258002540']")
    public WebElement toYear;

    @FindBy(xpath = "//select[@id='1970425032']")
    public WebElement anyMake;

    @FindBy(xpath = "//button[contains(text(),'Search')]")
    public WebElement advanceSearchButton;

    @FindBy(xpath = "//span[starts-with(@id,'aegenerated_')]")
    public WebElement zipCodeErrorMessage;

    @FindBy(xpath="//h1[@data-cmp='heading']")
    public WebElement header;


    public void checkBox(String checkBoxName) {

        try {

            if (manufacturerCertifiedChBox.isEnabled()) {
                if (checkBoxName.equals(manufacturerCertifiedChBox.getText())) {
                    manufacturerCertifiedChBox.click();
                }
            }


        } catch (Exception e) {

            JavascriptExecutor executor = (JavascriptExecutor) Driver.get();
            executor.executeScript("arguments[0].click()", manufacturerCertifiedChBox);


        }


        try {

            if (convertibleChBox.isEnabled()) {
                if (checkBoxName.equals(convertibleChBox.getText())) {
                    convertibleChBox.click();
                }
            }


        } catch (Exception e) {

            JavascriptExecutor executor = (JavascriptExecutor) Driver.get();
            executor.executeScript("arguments[0].click()", convertibleChBox);


        }


    }


    public void chooseYearFromTo(String from, String to) {
        int countYearFrom = 0;
        int countYearTo = 0;
        Select optionsFrom = new Select(fromYear);
        optionsFrom.selectByValue(from);
        /*List<WebElement> yearListFrom = optionsFrom.getOptions();
        for (WebElement year : yearListFrom) {

            if (year.getText().equals(from)) {
                yearListFrom.get(countYearFrom).click();
                break;
            }
            countYearFrom++;

        }*/

        Select optionsTo = new Select(toYear);
        optionsTo.selectByValue(to);
        /*List<WebElement> yearListTo = optionsTo.getOptions();
        for (WebElement year : yearListTo) {

            if (year.getText().equals(to)) {
                yearListTo.get(countYearTo).click();
                break;
            }
            countYearTo++;

        }*/


    }


    public void anyMakeSelect(String model) {
        int countAnyMake = 0;
        Select optionsModel = new Select(anyMake);
        optionsModel.selectByValue(model);
        /*List<WebElement> anyMakeList = optionsModel.getOptions();
        for (WebElement options:anyMakeList) {
            if(options.getText().equals(model)){
                anyMakeList.get(countAnyMake).click();
                break;
            }
            countAnyMake++;
        }*/


    }


    public void buttonClick(String button){

        try{
            if(advanceSearchButton.isEnabled()){
                if(button.equals(advanceSearchButton.getText())){
                    advanceSearchButton.click();
                }

            }

        }
        catch(Exception e){
            JavascriptExecutor executor=(JavascriptExecutor)Driver.get();
            executor.executeScript("arguments[0].click()",advanceSearchButton);
        }

    }


}
