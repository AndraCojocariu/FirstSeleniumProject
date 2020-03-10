import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogOutTest {
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

    //test 5
    @Test
    public void logOut(){
        driver.get("http://testfasttrackit.info/selenium-test/");
        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li.last > a")).click();
        driver.findElement(By.cssSelector("#email")).sendKeys("checkthisout@mailinator.com");
        driver.findElement(By.cssSelector("#pass")).sendKeys("Checkthisout");

        WebElement loginButton = driver.findElement(By.cssSelector("#send2"));
        loginButton.click();
        driver.findElement(By.cssSelector("div.account-cart-wrapper span:nth-child(2)")).click();
        driver.findElement(By.cssSelector("div.links li.last a[title~=Log]")).click();
        WebElement logOutMessage = driver.findElement(By.cssSelector("div.page-title h1"));
        Assert.assertTrue(logOutMessage.isDisplayed());

    }
}

