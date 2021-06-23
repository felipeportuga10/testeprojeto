package Pages.Plano;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PLanoCarrinhoPage {

    static WebDriver driver;

    public PLanoCarrinhoPage(WebDriver driver)

    { this.driver =driver;}

    public void elementoscarrinhoXpath(){

        WebElement aplicarcupom = driver.findElement(By.xpath("id=form_cupom"));
        aplicarcupom.sendKeys("85989585fedr89");

        WebElement botaoaplicar = driver.findElement(By.linkText("class=input-group-btn"));
        botaoaplicar.click();

        WebElement concluirpedido = driver.findElement(By.linkText("id=concluir_pedido"));
        concluirpedido.click();

    }
}
