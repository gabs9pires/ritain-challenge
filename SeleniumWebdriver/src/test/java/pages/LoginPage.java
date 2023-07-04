package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import runner.RunCucumber;
import support.Utils;

public class LoginPage extends Utils {
    WebDriver driver;
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    // elementos
    private String URL = "https://www.saucedemo.com/";
    private By botaoAcessarLogin = By.id("login-button");
    private By campoEmail = By.id("user");
    private By campoSenha = By.id("password");
    private By botaoFazerLogin = By.id("btnLogin");
    private By botaoAcessarCadastro = By.cssSelector(".right_list_fix > li > a > .fa-lock");

    // ações / funções / métodos
    public void acessarAplicao() {
        //getDriver(System.getProperty("browser")).get("https://www.saucedemo.com/12");
        driver.get("https://www.saucedemo.com/");
        Assert.assertEquals(true, driver.findElement(By.id("login-button")).isDisplayed());
        //waitElementBePresent(By.id("login-button"), 100);
    }

    public void acessarTelaLogin() {
        getDriver().findElement(botaoAcessarLogin).click();
    }

    public void preencheEmail(String email){
         getDriver().findElement(campoEmail).sendKeys(email);
    }

    public void preencherSenha(String senha){
        getDriver().findElement(campoSenha).sendKeys(senha);
    }

    public void clicarLogin(){
        getDriver().findElement(botaoFazerLogin).click();
    }

    public void verificaLoginSucesso(){
        String textoLoginSucesso = getDriver().findElement(By.id("swal2-title")).getText();
        Assert.assertEquals("Os textos não são iguais!", "Login realizado", textoLoginSucesso);
    }

    public void verificaCampoVazio(String message){
        String textError = getDriver().findElement(By.className("invalid_input")).getText();
        Assert.assertEquals(message, textError);
    }

    public void acessarTelaCadastro(){
        getDriver().findElement(botaoAcessarCadastro).click();
    }

}
