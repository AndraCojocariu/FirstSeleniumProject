import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {


    public static void main(String[] args) {
        login();
        wishlist();
        addToWishlist();
        registerTest();


    }

    //ex 1, 9
    public static void login() {

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://testfasttrackit.info/selenium-test/");
        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li.last > a")).click();
        driver.findElement(By.cssSelector("#email")).sendKeys("checkthisout@mailinator.com");
        driver.findElement(By.cssSelector("#pass")).sendKeys("Checkthisout");
        driver.findElement(By.cssSelector("#send2")).click();
        driver.quit();
    }

    /*public static void register() {

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://testfasttrackit.info/selenium-test/");
        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li.last > a")).click();
        driver.findElement(By.cssSelector("#send2")).click();

    }

     */

    //ex 2
    public static void wishlist() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://testfasttrackit.info/selenium-test/");
        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li.last > a")).click();
        driver.findElement(By.cssSelector("#email")).sendKeys("checkthisout@mailinator.com");
        driver.findElement(By.cssSelector("#pass")).sendKeys("Checkthisout");
        driver.findElement(By.cssSelector("#send2")).click();
        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li:nth-child(2) > a")).click();
        driver.quit();


    }

    //ex 4
    public static void addToWishlist() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://testfasttrackit.info/selenium-test/");
        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li.last > a")).click();
        driver.findElement(By.cssSelector("#email")).sendKeys("checkthisout@mailinator.com");
        driver.findElement(By.cssSelector("#pass")).sendKeys("Checkthisout");
        driver.findElement(By.cssSelector("#send2")).click();
        driver.findElement(By.xpath("//*[@id=\"nav\"]/ol/li[5]/a")).click();
        driver.findElement(By.cssSelector("body > div > div.page > div.main-container.col3-layout > div > div.col-wrapper > div.col-main > div.category-products > ul > li:nth-child(1) > div > div.actions > a")).click();
        driver.findElement(By.xpath("//*[@id=\"product_addtocart_form\"]/div[3]/div[6]/ul[1]/li[1]/a")).click();
        driver.quit();

    }

    //ex 6

    public static void registerTest() {

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

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
        driver.quit();


    }




}
