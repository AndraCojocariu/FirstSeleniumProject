import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

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


    //test 11
    @Test

    public void validLoginTest() {

        driver.get("http://testfasttrackit.info/selenium-test/");
        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).

                click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li.last > a")).

                click();
        driver.findElement(By.cssSelector("#email")).

                sendKeys("checkthisout@mailinator.com");
        driver.findElement(By.cssSelector("#pass")).

                sendKeys("Checkthisout");

        WebElement loginButton = driver.findElement(By.cssSelector("#send2"));
        loginButton.click();
        WebElement welcomeMessage = driver.findElement(By.cssSelector("body > div > div.page > div.main-container.col2-left-layout > div > div.col-main > div.my-account > div > div.welcome-msg > p.hello > strong"));
        Assert.assertEquals("Hello, chicho chiki!", welcomeMessage.getText());





        }




    }

