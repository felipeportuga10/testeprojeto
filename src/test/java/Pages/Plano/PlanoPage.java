package Pages.Plano;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static java.lang.System.exit;

public class PlanoPage {

    static WebDriver driver;

    public PlanoPage(WebDriver driver){ this.driver = driver;}

    public static void Test(){

    }

    public void elementosPlano(){

        WebElement planostestesfuncionaiswebmobile = driver.findElement(By.xpath("//*[@id=\"planos_list\"]/div[1]/div/div[1]/div/a/span[1]"));
        planostestesfuncionaiswebmobile.click();


        WebElement planotestesautomatizadosweb = driver.findElement(By.xpath("//*[@id=\"planos_list\"]/div[1]/div/div[2]/div/span/a"));
        planotestesautomatizadosweb.click();

        WebElement botaoassinarplano2 = driver.findElement(By.linkText("class=btn button btn-custom"));
        botaoassinarplano2.click();

        WebElement planotestesfuncionaiswebserveapipostman = driver.findElement(By.linkText("class=item-plan item "));
        planotestesfuncionaiswebserveapipostman.click();

        WebElement botaoassinarplano3 = driver.findElement(By.linkText("class=btn button btn-custom"));
        botaoassinarplano3.click();

        WebElement planotestesautomatizadosmobileandroid = driver.findElement(By.linkText("class=item-plan item "));
        planotestesautomatizadosmobileandroid.click();

        WebElement botaoassinarplano4 = driver.findElement(By.linkText("class=btn button btn-custom"));
        botaoassinarplano4.click();

        WebElement planotestesautomatizadosios = driver.findElement(By.linkText("class=item-plan item"));
        planotestesautomatizadosios.click();

        WebElement botaoassinarplano5 = driver.findElement(By.linkText("class=btn button btn-custom"));
        botaoassinarplano5.click();

        WebElement planotestesautomatizadosdeapisoapui = driver.findElement(By.linkText("class=item-plan item "));
        planotestesautomatizadosdeapisoapui.click();

        WebElement botaoassinarplano6 = driver.findElement(By.linkText("class=btn button btn-custom"));
        botaoassinarplano6.click();

        WebElement planotestesautomatizadosdeapiswagger = driver.findElement(By.linkText("class=item-plan item "));
        planotestesautomatizadosdeapiswagger.click();

        WebElement botaoassinarplano7 = driver.findElement(By.linkText("class=btn button btn-custom"));
        botaoassinarplano7.click();

        WebElement planotestesautomatizadosdeapirestassured = driver.findElement(By.linkText("class=item-plan item "));
        planotestesautomatizadosdeapirestassured.click();

        WebElement botaoassinarplano8 = driver.findElement(By.linkText("class=btn button btn-custom"));
        botaoassinarplano8.click();

        WebElement planotestesautomatizadosapipostman = driver.findElement(By.linkText("class=item-plan item "));
        planotestesautomatizadosapipostman.click();

        WebElement botaoassinarplano9 = driver.findElement(By.linkText("class=btn button btn-custom"));
        botaoassinarplano9.click();

        WebElement whatssap = driver.findElement(By.linkText("class=fa fa-whatssap"));
        whatssap.click();

        WebElement faleconosco = driver.findElement(By.linkText("class=fa fa-envelope"));
        faleconosco.click();

        WebElement politicadeprivacidade = driver.findElement(By.linkText("class=fa fa-file-text-o"));
        politicadeprivacidade.click();

        WebElement consultarcertificado = driver.findElement(By.linkText("class=hidden-sm"));
        consultarcertificado.click();

        WebElement facebook = driver.findElement(By.linkText("class=fa fa-facebook-square"));
        facebook.click();

        WebElement youtube = driver.findElement(By.linkText("class=fa fa-youtube-square"));
        youtube.click();

        WebElement instagram = driver.findElement(By.linkText("class=fa fa-instagram"));
        instagram.click();

        WebElement eadplataforma = driver.findElement(By.linkText("class=lfloat"));
        eadplataforma.click();

        WebElement curtirpagina = driver.findElement(By.linkText("class=pluginConnectButton"));
        curtirpagina.click();

        WebElement compartilharpagina = driver.findElement(By.linkText("class=_29bd rfloat _4o5q"));
        compartilharpagina.click();







    }

}
