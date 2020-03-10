import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class NewsletterTest {
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

    //test 6
    @Test

    public void newsletterSubTest(){
        driver.get("http://testfasttrackit.info/selenium-test/");
        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li.last > a")).click();
        driver.findElement(By.cssSelector("#email")).sendKeys("checkthisoutmate@mailinator.com");
        driver.findElement(By.cssSelector("#pass")).sendKeys("120911");

        WebElement loginButton = driver.findElement(By.cssSelector("#send2"));
        loginButton.click();
        driver.findElement(By.cssSelector("div.input-box input#newsletter")).sendKeys("checkthisoutmate@mailinator.com");
        driver.findElement(By.cssSelector("button[title=Subscribe] span span")).click();
        WebElement subscriptionMessage = driver.findElement(By.cssSelector("li.success-msg span"));
        Assert.assertEquals("Thank you for your subscription.", subscriptionMessage.getText());
    }

}
