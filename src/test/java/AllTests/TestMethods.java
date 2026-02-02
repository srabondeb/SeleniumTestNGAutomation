package AllTests;

import TestSetBreak.BeforeAfterMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.swing.*;

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
        Thread.sleep(2000);

        //used one example of assert statement to test the input value
        Assert.assertEquals(
                driver.findElement(Address).getAttribute("value"),"123 example Street"
        );

    }


    @Test(priority = 1)
    public void ButtonTest() throws InterruptedException{
        driver.get("https://formy-project.herokuapp.com/buttons");
        By infoButton = By.xpath("/html/body/div/form/div[1]/div/div/button[3]");
        driver.findElement(infoButton).click();
        Thread.sleep(2000);

        Assert.assertTrue(
                driver.findElement(infoButton).isEnabled(),
                "Info button was not activated after click"
        );

    }

    @Test(priority = 2)
    public void checkBoxTest() throws InterruptedException{
        By box1 = By.id("checkbox-1");
        driver.get("https://formy-project.herokuapp.com/checkbox");
        driver.findElement(box1).click();
        Thread.sleep(2000);

        Assert.assertTrue(
                driver.findElement(box1).isSelected(),"The box1 failed checked"
        );
    }

    @Test(priority = 3)
    public void DragAndDropTest() throws InterruptedException{
        By element = By.xpath("//*[@id=\"image\"]/img");
        By box = By.xpath("//*[@id=\"box\"]");

        driver.get("https://formy-project.herokuapp.com/dragdrop");
        Actions action = new Actions(driver);
        Thread.sleep(1000);
         action.dragAndDrop(driver.findElement(element), driver.findElement(box)).perform();
        Thread.sleep(1000);
         Assert.assertEquals(
                 driver.findElement(box).getText(),"Dropped!","drag and drop Failed"
         );

   }

   @Test(priority = 4)
    public void StaticDropDownTest() throws InterruptedException{
        driver.get("https://formy-project.herokuapp.com/dropdown");
        By dropDownButton = By.id("dropdownMenuButton");
       Thread.sleep(1000);
        driver.findElement(dropDownButton).click();
       Thread.sleep(1000);
   }







}
