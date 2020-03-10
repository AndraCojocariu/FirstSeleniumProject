import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchTest {
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

    //test 8
    @Test

    public void SearchTest1(){

        driver.get("http://testfasttrackit.info/selenium-test/");
        driver.findElement(By.cssSelector("input")).sendKeys("dress");
        driver.findElement(By.cssSelector("button")).click();

        WebElement searchMessage = driver.findElement(By.cssSelector("body > div > div.page > div.main-container.col3-layout > div > div.col-wrapper > div.col-main > div.page-title > h1"));
        Assert.assertEquals("SEARCH RESULTS FOR 'DRESS'", searchMessage.getText());
    }
}
