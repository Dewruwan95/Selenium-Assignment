package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Page7 extends Page6 {


    //20. Type sample data
    @Test(priority = 17)
    @Parameters({"userName", "userEmail", "userPassword"})
    public void typeUserDetails(String userName, String userEmail, String userPassword) throws InterruptedException {

        //wait for page loading
        Thread.sleep(5000);

        //get user name element
        WebElement userNameTextBox = driver.findElement(By.id("ap_customer_name"));

        //set user name
        userNameTextBox.sendKeys(userName);

        //get email element
        WebElement userEmailTextBox = driver.findElement(By.id("ap_email"));

        //set user email
        userEmailTextBox.sendKeys(userEmail);

        //get password element
        WebElement userPasswordTextBox = driver.findElement(By.id("ap_password"));

        //set user password
        userPasswordTextBox.sendKeys(userPassword);

        //get re-password element
        WebElement userRePasswordTextBox = driver.findElement(By.id("ap_password_check"));

        //set user re-password
        userRePasswordTextBox.sendKeys(userPassword);

    }

    @AfterTest
    public void closeWebpage() throws InterruptedException {

        //wait five seconds
        Thread.sleep(5000);

        //close page
        driver.close();
    }
}
