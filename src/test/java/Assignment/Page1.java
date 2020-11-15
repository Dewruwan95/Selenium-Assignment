package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Page1 {

    WebDriver driver;
    String url = "https://www.amazon.com/";


    //1,2. launch chrome browser and navigate to URL
    @BeforeTest
    public void loadWebPage() {
        String exePath = System.getProperty("user.dir") + "\\resources\\drivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", exePath);

        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();

    }


    //3. verify page url
    @Test(priority = 1)
    public void verifyUrl() {
        String actualUrl = driver.getCurrentUrl();

        if (actualUrl.equals(url)) {
            System.out.println("Verification Successful");
            System.out.println("Web Page URL is : " + actualUrl);
        } else {
            System.out.println("Verification Failed");
            System.out.println("Actual URl is : " + actualUrl);
            System.out.println("Expected URL is : " + url);
        }
    }

    //4. Select “Men’s Fashion” from main drop down box
    @Test(priority = 2)
    public void selectItemType() {

        Select dropDownSelect = new Select(driver.findElement(By.xpath("//select[@id='searchDropdownBox']")));
        dropDownSelect.selectByValue("search-alias=fashion-mens-intl-ship");

    }

    //5. Type “Shirt” on search bar
    @Test(priority = 3)
    public void typeText() {

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("shirt");

    }

    //6. Click on Search button icon
    @Test(priority = 4)
    public void btnSearchClick() {

        WebElement btnGo = driver.findElement(By.xpath("//header/div[@id='navbar']/div[@id='nav-belt']/div[2]/div[1]/form[1]/div[3]/div[1]/span[1]/input[1]"));
        btnGo.click();

    }

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
