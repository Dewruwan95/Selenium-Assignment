package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
//----------------------------------------------------------- Page 04 ---------------------------------------------------------

public class Page4 extends Page3 {

    public String itemPrice;


    //13. Print Item Price
    @Test(priority = 10)
    public void printPrice() throws InterruptedException {
        //wait for page loading
        Thread.sleep(5000);

        //get element
        WebElement productPrice = driver.findElement(By.xpath("//body/div[@id='a-page']/div[@id='cart-page-wrap']/div[@id='huc-page-container']/div[@id='huc-v2-order-row-with-divider']/div[@id='huc-v2-order-row-container']/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]/span[2]"));

        //get price
        itemPrice = productPrice.getText();

        //print price
        System.out.println("Item Price :" + itemPrice);
    }

    //14. Click on Cart
    @Test(priority = 11)
    public void clickCart() {
        //get element
        WebElement btnCart = driver.findElement(By.id("hlb-view-cart-announce"));

        //check button availability
        Assert.assertTrue(btnCart.isDisplayed());

        //click cart
        btnCart.click();

    }


}
