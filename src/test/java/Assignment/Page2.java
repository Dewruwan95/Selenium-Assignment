package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Page2 extends Page1{

    //7. select the first brand in brands category
    @Test(priority = 0)
    public void btnSearchClick() {

        loadWebPage();
        verifyUrl();
        selectItemType();
        typeText();
        btnSearchClick();

        WebElement btnGo = driver.findElement(By.xpath("//header/div[@id='navbar']/div[@id='nav-belt']/div[2]/div[1]/form[1]/div[3]/div[1]/span[1]/input[1]"));
        btnGo.click();

    }

    @AfterTest
    public void closeWebpage() {


        driver.close();
    }

}
