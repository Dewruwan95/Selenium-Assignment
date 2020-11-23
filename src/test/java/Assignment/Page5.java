package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

//----------------------------------------------------------- Page 05 ---------------------------------------------------------
public class Page5 extends Page4 {

    //15. Verify selected details in Shopping Cart page
    @Test(priority = 12)
    public void verifyCart() throws InterruptedException {

        //wait for page loading
        Thread.sleep(5000);

        //get cart item name element
        WebElement cartItemTitle = driver.findElement(By.xpath("//body/div[@id='a-page']/div[4]/div[1]/div[6]/div[1]/div[2]/div[4]/div[1]/form[1]/div[2]/div[3]/div[4]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[1]/span[1]/a[1]/span[1]"));

        //get item title by splitting
        String[] cartItemName = cartItemTitle.getText().split(" ,", 0);

        //verify item title
        if (cartItemName[0].equals(itemTitle)) {
            System.out.println("Item Name Verified");
        } else {
            System.out.println("Item Name Not Verified");

        }
        System.out.println("Item Name :" + cartItemName[0]);


        //get cart item price element
        WebElement cartItemPriceElement = driver.findElement(By.xpath("//body/div[@id='a-page']/div[4]/div[1]/div[6]/div[1]/div[2]/div[4]/div[1]/form[1]/div[2]/div[3]/div[4]/div[1]/div[2]/p[1]/span[1]"));

        //get item price
        String cartItemPrice = cartItemPriceElement.getText();

        //verify item price
        if (cartItemPrice.equals(itemPrice)) {
            System.out.println("Item Price Verified");
        } else {
            System.out.println("Item Price Not Verified");

        }
        System.out.println("Item Price :" + cartItemPrice);

    }


    //16. Assert the quantity of the item
    @Test(priority = 13)
    public void verifyQuantity() {

        //get quantity element
        WebElement productQuantity = driver.findElement(By.id("a-autoid-0-announce"));

        //get quantity
        String[] itemQty = productQuantity.getText().split("Qty: ");

        //assert item quantity
        Assert.assertTrue(Integer.parseInt(itemQty[1]) > 0);

        //print quantity
        System.out.println("Item Quantity :" + Integer.parseInt(itemQty[1]));

    }

    //17. Assert the Shopping Cart Subtotal
    @Test(priority = 14)
    public void verifySubtotal() {

        //get shopping cart subtotal element
        WebElement shoppingCartPrice = driver.findElement(By.xpath("//body/div[@id='a-page']/div[4]/div[1]/div[6]/div[1]/div[2]/div[4]/div[1]/form[1]/div[3]/span[2]/span[1]"));

        //get shopping cart subtotal
        String shoppingCartSubtotal = shoppingCartPrice.getText();

        //get proceed to checkout subtotal element
        WebElement proceedToCheckoutPrice = driver.findElement(By.xpath("//body/div[@id='a-page']/div[4]/div[1]/div[6]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/span[2]/span[1]"));

        //get proceed to checkout subtotal
        String proceedToCheckoutSubtotal = proceedToCheckoutPrice.getText();

        //assert subtotal
        Assert.assertEquals(shoppingCartSubtotal, proceedToCheckoutSubtotal);

        //print assertion
        System.out.println("Shopping Cart Subtotal is Equals to Proceed to Checkout Subtotal");

    }

    //18. Click on Proceed to Checkout button
    @Test(priority = 15)
    public void proceedToCheckout() {

        //get element
        WebElement btnProceedToCheckout = driver.findElement(By.xpath("//body/div[@id='a-page']/div[4]/div[1]/div[6]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/span[1]/span[1]/input[1]"));

        //check button availability
        Assert.assertTrue(btnProceedToCheckout.isDisplayed());

        //click button
        btnProceedToCheckout.click();

    }
}



