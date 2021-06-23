package Pages.Cursos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CursosPage {

    static WebDriver driver;

    public CursosPage (WebDriver driver){
        this.driver=driver;
    }
    public void elementosCursosXpath(){

        // campo de pesquisa
        WebElement pesquisa = driver.findElement(By.xpath("id=searchtext"));
        pesquisa.sendKeys("Pages/Cursos");

        WebElement botãoPesquisa = driver.findElement(By.linkText("id=btn_form_search"));
        botãoPesquisa.click();

        WebElement contato = driver.findElement(By.linkText("class=fa fa-phone"));
        contato.click();

        WebDriver navegador = null;
        navegador.findElement(By.linkText("pesquisar")).click();

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
