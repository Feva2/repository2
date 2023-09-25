package tests;

import base.Base;
import org.openqa.selenium.By;

public class Verify_CustomerLoginFunctionality extends Base{
    public static void main(String[] args) {
        // Verify Customer Login Functionality
        startUp();
        //Navigate to URL
        navigate("http://it.microtechlimited.com/");

        //Click Login Menu
        //driver.findElement(By.xpath("//a[@href='elogin.php']")).click();
        click(By.xpath("//a[@href='elogin.php']"));



        //Click Customer Login Menu
        //driver.findElement(By.xpath("//a[@href='clogin.php']")).click();
        click(By.xpath("//a[@href='clogin.php']"));

        //Enter Customer User Id
        //driver.findElement(By.xpath("//input[@name='mailuid']")).sendKeys("david@gmail.com");
        sendKeys(By.xpath("//input[@name='mailuid']\""), "david@gmail.com");

        //Enter Customer Password
        //driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("1234");
        sendKeys(By.xpath("\"//input[@name='pwd']\""),"1234");

        //Click Customer Login Button
        //driver.findElement(By.xpath("//input[@name='login-submit']")).click();
        click(By.xpath("//input[@name='login-submit']\"),'']"));

        //Verify David's Home Page
        //String welcomeMsg = driver.findElement(By.xpath("//h2[text()='Welcome David']")).getText();
        String welcomeMsg = getText("//h2[text()='Welcome David']");
        if (welcomeMsg.contains("David") )
            System.out.println("Pass");
        else
            System.out.println("Fail");


    }
}
