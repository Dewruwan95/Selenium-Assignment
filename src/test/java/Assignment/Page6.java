package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Page6 extends Page5 {

    //19. Click on Create your Amazon Account button
    @Test(priority = 16)
    public void createAccount() throws InterruptedException {

        //wait for page loading
        Thread.sleep(5000);

        //get element
        WebElement btnCreateAccount = driver.findElement(By.id("createAccountSubmit"));

        //check button availability
        Assert.assertTrue(btnCreateAccount.isDisplayed());

        //click cart
        btnCreateAccount.click();

    }

}
