package Pages.Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    static WebDriver driver;

    public LoginPage(WebDriver driver){this.driver = driver;}

    public static void Test() {
    }

    public void preenchimentoLogin(){

        WebElement email = driver.findElement(By.xpath("//*[@id=\"email\"]"));
        email.sendKeys("filipe110787@hotmail.com");

        WebElement senha = driver.findElement(By.xpath("//*[@id=\"senha\"]"));
        senha.sendKeys("gordao10");

        WebElement botaoentrar = driver.findElement(By.xpath("//*[@id=\"btn_login\"]"));
        botaoentrar.click();

    }
}
