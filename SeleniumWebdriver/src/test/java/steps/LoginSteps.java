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
        loginPage.acessarTelaLogin();
    }

    @Quando("^preencho login \"([^\"]*)\" e senha \"([^\"]*)\"")
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

    @Entao("^vejo mensagem \"([^\"]*)\" de campo nao preenchido$")
    public void vejo_mensagem_de_campo_nao_preenchido(String message)  {
        loginPage.verificaCampoVazio(message);
    }

    @Quando("^acesso a tela de cadastro de usuario$")
    public void acesso_a_tela_de_cadastro_de_usuario() {
        loginPage.acessarTelaCadastro();
    }

    @Dado("^que estou logado na aplicacao com user \"([^\"]*)\" e senha \"([^\"]*)\"$")
    public void que_estou_logado_na_aplicacao_com_user_e_senha(String email, String senha)  {
        loginPage.acessarAplicao();
        loginPage.acessarTelaLogin();
        loginPage.preencheEmail(email);
        loginPage.preencherSenha(senha);
        loginPage.clicarLogin();
        loginPage.verificaLoginSucesso();
    }

}
