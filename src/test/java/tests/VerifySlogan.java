package tests;
import base.Base;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class VerifySlogan extends Base {
    public static void main(String[] args) {
        //Verify Landing Page slogan is "Your One Stop Solution"
        startUp();

        WebElement pageSloganElement = driver.findElement( By.xpath("//p") );
        String pageSloganText = pageSloganElement.getText();
        if (pageSloganText.equals("Your One Stop Solution"))
            System.out.println("Pass");
        else
            System.out.println("Fail");
    }//main
}
