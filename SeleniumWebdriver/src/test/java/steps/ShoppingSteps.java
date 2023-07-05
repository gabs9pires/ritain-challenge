package steps;

import cucumber.api.java.pt.*;
import pages.LoginPage;
import pages.ShoppingPage;
import runner.RunCucumber;

public class ShoppingSteps extends RunCucumber {
    ShoppingPage shoppingPage = new ShoppingPage(driver);
    LoginPage loginPage = new LoginPage(driver);

    @Dado("^que estou na tela de compras$")
    public void que_estou_na_tela_de_compras() {
        shoppingPage.logarSite();
        shoppingPage.fazerLoginUserDefault();
        loginPage.verificaLoginSucesso();
    }

    @Quando("^adiciono o produto '(.*)' no carrinho$")
    public void adiciono_o_produto_no_carrinho(String produtos) {
        shoppingPage.adiciono_o_produto_no_carrinho(produtos);
    }


    @Entao("^produto e adicionado ao carrinho$")
    public void produto_e_adicionado_ao_carrinho(){
        shoppingPage.produto_e_adicionado_ao_carrinho();
    }


}
