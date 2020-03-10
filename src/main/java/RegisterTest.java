import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterTest {
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

    //test 7
    @Test

    public void RegisterTest1(){
        driver.get("http://testfasttrackit.info/selenium-test/");
        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.findElement(By.xpath("//*[@id=\"header-account\"]/div/ul/li[5]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"firstname\"]")).sendKeys("Cici");
        driver.findElement(By.cssSelector("#lastname")).sendKeys("Lala");
        driver.findElement(By.xpath("//*[@id=\"email_address\"]")).sendKeys("checkthisoutmate@mailinator.com");
        driver.findElement(By.cssSelector("#password")).sendKeys("120911");
        driver.findElement(By.cssSelector("#confirmation")).sendKeys("120911");
        WebElement radiobutton = driver.findElement(By.xpath("//*[@id=\"form-validate\"]/div[1]/ul/li[4]/label"));
        radiobutton.click();
        driver.findElement(By.xpath("//*[@id=\"form-validate\"]/div[2]/button/span/span")).click();

        WebElement registerMessage = driver.findElement(By.cssSelector("body > div > div.page > div.main-container.col1-layout > div > div > div.account-create > ul > li > ul > li > span"));
        Assert.assertEquals("There is already an account with this email address. If you are sure that it is your email address, click here to get your password and access your account.", registerMessage.getText());
    }
}
