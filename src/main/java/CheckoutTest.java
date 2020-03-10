import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckoutTest {
    private WebDriver driver;

    @Before
    public void initDriver() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
    }
    @After

    public void close(){
        driver.quit();
    }

    @Test

    //test 1
    public void checkoutTest1(){
        driver.get("http://testfasttrackit.info/selenium-test/");
        driver.findElement(By.cssSelector("input")).sendKeys("park row throw");
        driver.findElement(By.cssSelector("button")).click();
        driver.findElement(By.cssSelector("img#product-collection-image-384")).click();
        driver.findElement(By.cssSelector("#product_addtocart_form > div.add-to-cart-wrapper > div > div > div.add-to-cart-buttons > button > span > span")).click();
        driver.findElement(By.cssSelector("button:first-child")).click();

        WebElement checkoutHeader = driver.findElement(By.cssSelector("body > div > div.page > div.main-container.col2-right-layout > div > div.col-main > div.page-title > h1"));
        Assert.assertTrue(checkoutHeader.isDisplayed());
    }

}
