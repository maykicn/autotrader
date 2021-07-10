package com.autotrader.pages;

import com.autotrader.utilities.BrowserUtils;
import com.autotrader.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    public HomePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//button[contains(.,'Search by Budget')]")
    public WebElement searchByBudget;

    @FindBy(xpath = "//button[contains(.,'Browse by Style')]")
    public WebElement browseByStyle;

    @FindBy(xpath = "//div[@class='display-inline-block']//a")
    public WebElement advancedSearch;

    @FindBy(xpath = "//button[@id='search']")
    public WebElement searchButton;

    @FindBy(xpath = "//select[@id='2230463214']")
    public WebElement makeElement;

    @FindBy(xpath = "//select[@id='1617644117']")
    public WebElement modelElement;


    public void verification(String expected)  {
        HomePage homePage = new HomePage();


        //homePage.ClearBrowserCache();
        if (expected.equals(searchByBudget.getText())){
            String actual=searchByBudget.getText();
            Assert.assertEquals(expected+"is not present",expected,actual);

        }else if (expected.equals(browseByStyle.getText())){
            String actual=browseByStyle.getText();
            Assert.assertEquals(expected+"is not present",expected,actual);


        }else if (expected.equals(advancedSearch.getText())){
            String actual=advancedSearch.getText();
            Assert.assertEquals(expected+"is not present",expected,actual);


        }else if (expected.equals(searchButton.getText())){
            String actual=searchButton.getText();
            Assert.assertEquals(expected+"is not present",expected,actual);


        }else if (expected.equals(makeElement.getText())){
            String actual=makeElement.getText();
            Assert.assertEquals(expected+"is not present",expected,actual);


        }else if (expected.equals(modelElement.getText())){
            String actual=modelElement.getText();
            Assert.assertEquals(expected+"is not present",expected,actual);


        }else if (expected.equals(homePage.searchButton.getText())){
            String actual=homePage.searchButton.getText();
            Assert.assertEquals(expected+" button is not present",expected,actual);

        }



    }

    public void onTheLandingPage(){
        String expectedTitle="Used and New Car Sales, Review - Autotrader";
        String actualTitle=Driver.get().getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
        BrowserUtils.waitFor(5);



    }
    public void ClearBrowserCache() throws InterruptedException {
        Thread.sleep(3000); //wait 1 seconds to clear cookies.
        Driver.get().manage().deleteAllCookies();//delete all cookies


    }

    public void textBoxIsVisible(String textBoxName){

        if (makeElement.isEnabled()){
            Assert.assertTrue(makeElement.isEnabled());
        }else if(modelElement.isEnabled()){
            Assert.assertTrue(modelElement.isEnabled());
        }
    }




}
