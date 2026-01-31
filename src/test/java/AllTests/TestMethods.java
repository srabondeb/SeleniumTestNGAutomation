package AllTests;

import TestSetBreak.BeforeAfterMethods;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestMethods extends BeforeAfterMethods {
    @Test(priority = 0)
    public void testAutocomplete(){
        By Address = By.id("autocomplete");
        By city = By.id("autocomplete");
        By state = By.id("autocomplete");
        By zip = By.id("autocomplete");
        By country = By.id("autocomplete");

        driver.get("https://formy-project.herokuapp.com/autocomplete");
        driver.findElement(Address).sendKeys("123 example Street");
    }
}
