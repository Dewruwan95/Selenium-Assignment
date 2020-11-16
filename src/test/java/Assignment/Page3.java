package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Page3 extends Page2 {

    //8. Select a size
    @Test(priority = 7)
    public void selectProductSize() {
        Select shirtSize = new Select(driver.findElement(By.id("native_dropdown_selected_size_name")));
        shirtSize.selectByValue("2,B0785VMVF4");
    }

//    @AfterTest
//    public void closeWebpage() {
//
//        driver.close();
//    }
}
