package AllTests;

import TestSetBreak.BeforeAfterMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class TestMethods extends BeforeAfterMethods {
    @Test(priority = 0)
    public void testAutocomplete() throws InterruptedException {
        By Address = By.id("autocomplete");
        By city = By.id("locality");
        By state = By.id("administrative_area_level_1");
        By zip = By.id("postal_code");
        By country = By.id("country");

        driver.get("https://formy-project.herokuapp.com/autocomplete");
        driver.findElement(Address).sendKeys("123 example Street");
        driver.findElement(city).sendKeys("Manassas");
        driver.findElement(state).sendKeys("Virginia");
        driver.findElement(zip).sendKeys("20109");
        driver.findElement(country).sendKeys("Prince William");

        //wait 2 second to inspect all the boxes
        Thread.sleep(2000);
    }




}
