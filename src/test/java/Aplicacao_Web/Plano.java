package Aplicacao_Web;

import Pages.Plano.PlanoPage;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Plano {

    static WebDriver driver;
    static Plano PlanoPage;
    static Object elementosPlanoPage;

//    public Plano(WebDriver driver,Object elementosPlanoPage) {
//        this.driver = driver;
//        this.elementosPlanoPage = elementosPlanoPage;
 //    }

    public void Plano(WebDriver driver){this.driver = driver;}

    @Before
    public void setElementosPlanoPage() throws Exception{
        System.setProperty("webdriver.chrome.driver","C:\\\\Windows\\\\chromedriver.exe");

        driver = new ChromeDriver();

        driver.get("https://triosdecapacitacao.eadplataforma.com/planos/");

        //Plano.PlanoPage = new Plano(driver, elementosPlanoPage);
    }
    @Test
    public void Test(){
        PlanoPage c = new PlanoPage(driver);
        c.elementosPlano();

    }
}
