package Aplicacao_Web;

import Pages.Login.LoginPage;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

    static WebDriver driver;
    static Object preenchimentoLogin;
    static Login LoginPage;


//    public Login(WebDriver driver,Object preenchimentoLoginXpath){
//        this.driver = driver;
//        this.preenchimentoLoginXpath = preenchimentoLoginXpath;
//    }

    public void Login(WebDriver driver){this.driver = driver;}

    @Before
    public void setLoginPage() throws Exception{
        System.setProperty("webdriver.chrome.driver","C:\\Windows\\chromedriver.exe");

        driver = new ChromeDriver();

        driver.get("https://triosdecapacitacao.eadplataforma.com/login/");

         //Pages.Login.LoginPage = new Login(driver, preenchimentoLoginXpath);

    }
    @Test
    public void Test() {
        LoginPage c = new LoginPage(driver);
        c.preenchimentoLogin();
    }




}
