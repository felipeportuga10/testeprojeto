package Aplicacao_Web;

import Pages.Cadastro.CadastroPage;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Cadastro{

    static WebDriver driver;
    static Cadastro CadastroPage;
    static Object preenchimentoCadastro;


//    public Cadastro(WebDriver driver,Object preenchimentoCadastroXpath){
//        this.driver = driver;
//        this.preenchimentoCadastroXpath = preenchimentoCadastroXpath;
//
//    }

    public void Cadastro(WebDriver driver){
        this.driver = driver;
    }

    @Before
    public void setpreenchimentocadastro() throws Exception{
        System.setProperty("webdriver.chrome.driver","C:\\Windows\\chromedriver.exe");

        driver = new ChromeDriver();

        driver.get("https://triosdecapacitacao.eadplataforma.com/cadastro/");

        //CadastroPage = new Cadastro(driver, preenchimentoCadastroXpath);
    }
    @Test
    public void Test(){
          CadastroPage c = new CadastroPage(driver);
          c.preenchimentoCadastro();



    }



}
