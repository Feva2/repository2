package base;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Base {
    public static WebDriver driver;
    public static void startUp() {
        WebDriverManager.chromedriver().setup();
        //WebDriver driver;
        driver = new ChromeDriver();
    }

    public static void navigate(String url) {
        driver.get(url);
    }

    public static void getTextCheck(String xpath, String text) {
        WebElement logoTextElement = Base.driver.findElement(By.xpath(xpath));
        String logoText = logoTextElement.getText();
        if (logoText.equals(text))
            System.out.println("Pass");
        else
            System.out.println("Fail");
    }

    public static void click(By locator) {
        driver.findElement(locator).click();
    }



    public static void sendKeys(By locator,String keys) {
        driver.findElement(locator).sendKeys(keys);
    }



    public static String getText(String xpath) {
        String s = driver.findElement(By.xpath(xpath)).getText();
        return s;
    }

}
