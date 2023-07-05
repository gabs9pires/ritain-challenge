package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import support.Utils;

public class LoginPage extends Utils {
    WebDriver driver;
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    // elementos
    private String URL = "https://www.saucedemo.com/";
    private By campoEmail = By.id("user-name");
    private By campoSenha = By.id("password");

    private By botaoFazerLogin = By.id("login-button");
    private By botaoAcessarCadastro = By.cssSelector(".right_list_fix > li > a > .fa-lock");

    // ações / funções / métodos
    public void acessarAplicao() {
        logarSite();
    }

    public void preencheEmail(String email){
         driver.findElement(campoEmail).sendKeys(email);
    }

    public void preencherSenha(String senha){
        driver.findElement(campoSenha).sendKeys(senha);
    }

    public void clicarLogin(){
        driver.findElement(botaoFazerLogin).click();
    }

    public void verificaLoginSucesso(){
        String textoLoginSucesso = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span")).getText();
        Assert.assertEquals("Os textos não são iguais!", "Products", textoLoginSucesso);
    }

    public void verificaCampoVazio(String message){
        String textError = getDriver().findElement(By.className("invalid_input")).getText();
        Assert.assertEquals(message, textError);
    }

    public void acessarTelaCadastro(){
        getDriver().findElement(botaoAcessarCadastro).click();
    }

}
