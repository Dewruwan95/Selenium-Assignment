package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Page3 extends Page2 {

    //8. Select a size
    @Test(priority = 7)
    public void selectProductSize() {
        System.out.println("before select");

        Select sizeDropDownSelect = new Select(driver.findElement(By.xpath("//body/div[@id='a-page']/div[@id='dp']/div[@id='dp-container']/div[@id='ppd']/div[2]/div[2]/div[1]/div[1]/div[1]/div[12]/div[1]/div[2]/form[1]/div[2]/span[1]/span[1]/span[1]/span[1]/span[1]")));
        System.out.println("after selected");
        sizeDropDownSelect.selectByValue("2,B0785VMVF4");

    }

//    @AfterTest
//    public void closeWebpage() {
//
//        driver.close();
//    }
}
