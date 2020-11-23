package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
//----------------------------------------------------------- Page 03 ---------------------------------------------------------

public class Page3 extends Page2 {

    public String itemTitle;

    //9. Select a size
    @Test(priority = 7)
    public void selectProductSize() throws InterruptedException {
        //wait for page loading
        Thread.sleep(5000);

        //select size
        Select shirtSize = new Select(driver.findElement(By.id("native_dropdown_selected_size_name")));
        shirtSize.selectByValue("2,B0785VMVF4");//medium size
    }

    //10,11. Print the Item Title & Title length
    @Test(priority = 8)
    public void getItemTitle() {
        //get item title
        WebElement productTitle = driver.findElement(By.id("productTitle"));
        itemTitle = productTitle.getText();
        System.out.println("Item Title :" + itemTitle);

        //get item title length
        int itemTitleLength = itemTitle.length();
        System.out.println("Item Title Length: " + itemTitleLength);
    }

    //12. Select “Add To Cart”
    @Test(priority = 9)
    public void addToCart() throws InterruptedException {
        //wait for loading
        Thread.sleep(5000);

        //get element
        WebElement bthAddToCart = driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));

        //check Add to cart button availability
        Assert.assertTrue(bthAddToCart.isDisplayed());

        //click button
        bthAddToCart.click();
    }

}
