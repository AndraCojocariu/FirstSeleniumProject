import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CartTest {

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


    //test 2
    @Test
    public void cartTest1() {
        driver.get("http://testfasttrackit.info/selenium-test/");
        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li.last > a")).click();
        driver.findElement(By.cssSelector("#email")).sendKeys("checkthisout@mailinator.com");
        driver.findElement(By.cssSelector("#pass")).sendKeys("Checkthisout");

        WebElement loginButton = driver.findElement(By.cssSelector("#send2"));
        loginButton.click();
        driver.get("http://testfasttrackit.info/selenium-test/sale.html");
        driver.findElement(By.cssSelector("img#product-collection-image-423")).click();
        driver.findElement(By.cssSelector("span.swatch-label img")).click();
        driver.findElement(By.cssSelector("a#swatch80 span:first-child")).click();
        driver.findElement(By.cssSelector("div.add-to-cart-buttons button")).click();

        WebElement addedToCartMessage = driver.findElement(By.cssSelector("li.success-msg span"));
        Assert.assertTrue("Racer Back Maxi Dress was added to your shopping cart", addedToCartMessage.isDisplayed());


    }

    //test 3
    @Test

    public void cartTest2() {
        driver.get("http://testfasttrackit.info/selenium-test/");
        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li.last > a")).click();
        driver.findElement(By.cssSelector("#email")).sendKeys("checkthisout@mailinator.com");
        driver.findElement(By.cssSelector("#pass")).sendKeys("Checkthisout");

        WebElement loginButton = driver.findElement(By.cssSelector("#send2"));
        loginButton.click();
        driver.get("http://testfasttrackit.info/selenium-test/sale.html");
        driver.findElement(By.cssSelector("img#product-collection-image-423")).click();
        driver.findElement(By.cssSelector("span.swatch-label img")).click();
        driver.findElement(By.cssSelector("a#swatch80 span:first-child")).click();
        driver.findElement(By.cssSelector("div.add-to-cart-buttons button")).click();
        driver.findElement(By.cssSelector("td.a-center.product-cart-remove.last a")).click();

        WebElement emptyCartMessage = driver.findElement(By.cssSelector("div.page-title h1"));
        Assert.assertTrue(emptyCartMessage.isDisplayed());


    }


    //test 4
    @Test
    public void cartTest3() {
        driver.get("http://testfasttrackit.info/selenium-test/");
        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li.last > a")).click();
        driver.findElement(By.cssSelector("#email")).sendKeys("checkthisout@mailinator.com");
        driver.findElement(By.cssSelector("#pass")).sendKeys("Checkthisout");

        WebElement loginButton = driver.findElement(By.cssSelector("#send2"));
        loginButton.click();
        driver.get("http://testfasttrackit.info/selenium-test/sale.html");
        driver.findElement(By.cssSelector("img#product-collection-image-423")).click();
        driver.findElement(By.cssSelector("span.swatch-label img")).click();
        driver.findElement(By.cssSelector("a#swatch80 span:first-child")).click();

        WebElement quantityBox = driver.findElement(By.cssSelector("div.qty-wrapper input"));
        quantityBox.clear();
        quantityBox.sendKeys("3");
        driver.findElement(By.cssSelector("div.add-to-cart-buttons button")).click();
        WebElement checkQuantity = driver.findElement(By.cssSelector("div.header-minicart span:nth-child(3)"));
        Assert.assertEquals("3", checkQuantity.getText());


    }



}
