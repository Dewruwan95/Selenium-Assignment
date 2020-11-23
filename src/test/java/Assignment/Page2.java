package Assignment;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
//----------------------------------------------------------- Page 02 ---------------------------------------------------------

public class Page2 extends Page1 {


    //7. select the first brand in brands category
    @Test(priority = 5)
    public void brandCheckBoxClick() throws InterruptedException {
        //wait for page loading
        Thread.sleep(5000);

        //select brand
        WebElement checkBox = driver.findElement(By.xpath("//span[contains(text(),'Under Armour')]"));
        checkBox.click();

    }

    //8. Select the first search item
    @Test(priority = 6)
    public void selectProduct() throws InterruptedException {
        //wait for loading
        Thread.sleep(5000);

        //select element
        WebElement selectedProduct = driver.findElement(By.xpath("//body/div[@id='a-page']/div[@id='search']/div[1]/div[2]/div[1]/span[3]/div[2]/div[2]/div[1]/span[1]/div[1]/div[1]/span[1]/a[1]/div[1]/img[1]"));

        //check element availability
        Assert.assertTrue(selectedProduct.isDisplayed());

        //select item
        selectedProduct.click();
    }
}
