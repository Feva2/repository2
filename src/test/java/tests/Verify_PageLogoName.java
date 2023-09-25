package tests;
import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Verify_PageLogoName extends Base {
    public static void main(String[] args) {
        //Verify Page Logo name is "Microtech"
        Base.startUp();

        getTextCheck("//nav/h1", "MicroTech NA");

    }
}
