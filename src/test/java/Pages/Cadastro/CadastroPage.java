package Pages.Cadastro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CadastroPage {

    static WebDriver driver;

    public CadastroPage(WebDriver driver){
        this.driver = driver;
    }

    public static void Test() {
    }

    public void preenchimentoCadastro(){

        WebElement nome = driver.findElement(By.xpath("//*[@id=\"nome\"]"));
        nome.sendKeys(  "Filipe Vieira Emiliano");

        WebElement telefone = driver.findElement(By.id("telefone"));
        telefone.sendKeys(  "(11)911111111");

        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys(  "FilipePortuga@hotmail.com");

        WebElement senha = driver.findElement(By.id("senha"));
        senha.sendKeys(  "Portuga10");

        WebElement captcha = driver.findElement(By.xpath("//*[@id=\"e-captcha\"]"));
        captcha.sendKeys(  "hetpsr7");

        WebElement criarConta = driver.findElement(By.xpath("//*[@id=\"btn_cadastro\"]"));
        criarConta.click();



    }
}
