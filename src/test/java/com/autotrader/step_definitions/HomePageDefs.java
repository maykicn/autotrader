package com.autotrader.step_definitions;

import com.autotrader.pages.HomePage;
import com.autotrader.utilities.BrowserUtils;
import com.autotrader.utilities.ConfigurationReader;
import com.autotrader.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class HomePageDefs {
    HomePage homePage = new HomePage();


    @Given("User is on the landing page")
    public void user_is_on_the_landing_page() throws InterruptedException {
        homePage.onTheLandingPage();
        homePage.ClearBrowserCache();
        Thread.sleep(2);
        Driver.get().navigate().refresh();
        Thread.sleep(2);


    }

    @Then("Verify that {string} is present")
    public void verify_that_are_present(String expected){
        homePage.verification(expected);

    }

    @Then("Verify that {string} button is present")
    public void verify_that_search_button_is_present(String expected) {
         homePage.verification(expected);
    }

    @Then("Verify that {string} is visible")
    public void verify_that_is_visible(String textBox) {
        homePage.textBoxIsVisible(textBox);

    }

}
