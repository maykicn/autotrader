package com.autotrader.step_definitions;

import com.autotrader.pages.AdvanceSearchPage;
import com.autotrader.pages.HomePage;
import com.autotrader.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Cookie;

public class AdvanceSearchDefs {
    AdvanceSearchPage advanceSearchPage = new AdvanceSearchPage();
    public Cookie mainCookie = null;

    @When("Click on {string} on the landing page")
    public void click_on_on_the_landing_page(String string) throws InterruptedException {
        HomePage homePage = new HomePage();
        homePage.advancedSearch.click();
        homePage.ClearBrowserCache();
        Driver.get().navigate().refresh();
    }

    @Then("User enter {string} in the zip code text box")
    public void user_enter_in_the_zip_code_text_box(String zipCode) throws InterruptedException {
        Thread.sleep(2);
        advanceSearchPage.advanceSearchPageTextBox.sendKeys("30004");

    }

    @Then("User select the {string} check box under {string}")
    public void user_select_the_check_box_under(String checkBoxName, String string2) {
        advanceSearchPage.checkBox(checkBoxName);
    }

    @Then("User update year {string} to {string}")
    public void user_update_year_to(String from, String to) {
        advanceSearchPage.chooseYearFromTo(from, to);
    }

    @Then("User select {string} car from Make,Model and trim")
    public void user_select_car_from_Make_Model_and_trim(String model) {
        advanceSearchPage.anyMakeSelect(model);
    }

    @Then("User click on {string} button")
    public void user_click_on_button(String button) throws InterruptedException {


        Driver.get().manage().deleteCookieNamed("ak_bmsc");
        Thread.sleep(2);
        advanceSearchPage.buttonClick(button);
        Thread.sleep(2);

        /*Set<Cookie> cookies=Driver.get().manage().getCookies();
        System.out.println("cookies.size() = " + cookies.size());
        for(Cookie cookie:cookies){
            System.out.println(cookie.getName()+"   "+cookie.getValue());

        }


        */


        /*Driver.get().manage().deleteCookieNamed("aam_uuid");
        advanceSearchPage.buttonClick(button);*/

        /*Set<Cookie> cookies = Driver.get().manage().getCookies();
        for(Cookie cookiess:cookies) {
            System.out.println(cookiess.getName() + "   " + cookiess.getValue());
        }

        all:
        for (Cookie cookie : cookies) {

            try {

                advanceSearchPage.buttonClick(button);
                if (mainCookie != null) {
                    Driver.get().manage().addCookie(mainCookie);
                }

                Driver.get().manage().deleteCookie(cookie);
                mainCookie = cookie;

            } catch (Exception e) {
                System.out.println("mainCookie = " + mainCookie.getName());

                break all;
            }*/


            //Thread.sleep(2);
            /*if (advanceSearchPage.zipCodeErrorMessage.isDisplayed()) {


            }


        }*/

    }

    @Then("Verify that listing on the next page")
    public void verify_that_listing_on_the_next_page() throws InterruptedException {
        Thread.sleep(2);
        String expectedTitle="Certified Convertibles for Sale in Alpharetta, GA";
        String actualTitle=advanceSearchPage.header.getText();
        //System.out.println("Driver.get().getTitle() = " + Driver.get().getTitle());
        Assert.assertEquals(expectedTitle,actualTitle);

    }

    @Then("Verify that only {string} are on the results")
    public void verify_that_only_are_on_the_results(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("Display in console, the number of cars listed in result page")
    public void display_in_console_the_number_of_cars_listed_in_result_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
