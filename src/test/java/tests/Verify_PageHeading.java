package tests;

import base.Base;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Verify_PageHeading extends Base {
    public static void main(String[] args) {
        //Verify Landing Page Heading Text is "Welcome to MicroTech NA."
        startUp();

        getTextCheck("//div/h1", "Welcome to MicroTech NA.");
//        WebElement pageHeadingElement = driver.findElement(By.xpath("//div/h1"));
//        String headingElementText = pageHeadingElement.getText();
//        if (headingElementText.equals("Welcome to MicroTech NA."))
//            System.out.println("Pass");
//        else
//            System.out.println("Fail");
    }
}//class