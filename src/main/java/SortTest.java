import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SortTest {
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

    //test 9
    @Test

    public void SortButtonTest(){
        driver.get("http://testfasttrackit.info/selenium-test/sale.html");
        WebElement sortButton = driver.findElement(By.cssSelector("div.sort-by select"));
        Assert.assertTrue(sortButton.isDisplayed());

    }
}
