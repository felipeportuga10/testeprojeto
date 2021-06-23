package Pages.Plano;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PlanoIdentificacaoLoginPage {

    static WebDriver driver;

    public PlanoIdentificacaoLoginPage(WebDriver driver){this.driver = driver;}

    public void preenchimentodeidentificacaoXpath(){

        WebElement nome = driver.findElement(By.xpath("id=nome"));
        nome.sendKeys(  "Filipe Portuga");

        WebElement telefone = driver.findElement(By.xpath("id=telefone"));
        telefone.sendKeys(  "(11)911111111");

        WebElement email = driver.findElement(By.xpath("id=email"));
        email.sendKeys(  "FilipePortuga@hotmail.com");

        WebElement senha = driver.findElement(By.xpath("id=senha"));
        senha.sendKeys(  "Portuga10");

        WebElement captcha = driver.findElement(By.xpath("id=e-captcha"));
        captcha.sendKeys(  "hetpsr7");

        WebElement criarConta = driver.findElement(By.xpath("id=btn_cadastro"));
        criarConta.click();

        
    }
}
