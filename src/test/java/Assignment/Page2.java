package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Page2 extends Page1 {

    //7. select the first brand in brands category
    @Test(priority = 5)
    public void brandCheckBoxClick() {

        WebElement checkBox = driver.findElement(By.xpath("//span[contains(text(),'Under Armour')]"));
        checkBox.click();

    }

    @AfterTest
    public void closeWebpage() {

        driver.close();
    }
}
