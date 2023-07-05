package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import pages.LoginPage;
import runner.RunCucumber;

public class LoginSteps extends RunCucumber {

    LoginPage loginPage = new LoginPage(driver);

    @Dado("^que estou na tela de login$")
    public void que_estou_na_tela_de_login() {
        loginPage.acessarAplicao();
    }

    @Quando("^preencho login '(.*)' e senha '(.*)'$")
    public void preencho_login_e_senha(String email, String senha) {
        loginPage.preencheEmail(email);
        loginPage.preencherSenha(senha);
    }

    @Quando("^clico em Login$")
    public void clico_em_Login() {
        loginPage.clicarLogin();
    }

    @Entao("^vejo mensagem de login com sucesso$")
    public void vejo_mensagem_login_sucesso() {
        loginPage.verificaLoginSucesso();
    }

}
