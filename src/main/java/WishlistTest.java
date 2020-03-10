import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WishlistTest {
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

    //test 10
    @Test

    public void wishlistTest() {
        driver.get("http://testfasttrackit.info/selenium-test/");
        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li.last > a")).click();
        driver.findElement(By.cssSelector("#email")).sendKeys("checkthisout@mailinator.com");
        driver.findElement(By.cssSelector("#pass")).sendKeys("Checkthisout");
        driver.findElement(By.cssSelector("#send2")).click();
        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li:nth-child(2) > a")).click();
        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();


        WebElement myWishlistStatus = driver.findElement(By.cssSelector("#header-account > div > ul > li:nth-child(2) > a"));
        Assert.assertEquals("My Wishlist (1 item)", myWishlistStatus.getText());


    }

    //test 12
    @Test
    public void wishlistButton(){
        driver.get("http://testfasttrackit.info/selenium-test/");
        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li.last > a")).click();
        driver.findElement(By.cssSelector("#email")).sendKeys("checkthisout@mailinator.com");
        driver.findElement(By.cssSelector("#pass")).sendKeys("Checkthisout");
        driver.findElement(By.cssSelector("#send2")).click();
        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li:nth-child(2) > a")).click();
        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();


        WebElement myWishlistButton = driver.findElement(By.cssSelector("#header-account > div > ul > li:nth-child(2) > a"));
        Assert.assertTrue("My Wishlist", myWishlistButton.isDisplayed());
    }
}
