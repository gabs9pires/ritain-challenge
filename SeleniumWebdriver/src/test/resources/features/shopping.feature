# language: pt

@escolher_produto
Funcionalidade: Escolher produto
  Eu como usuário do sistema
  Quero adicionar um produto no carrinho
  Para fazer uma compra no site

  Cenário: Adicionar ao carrinho - sucesso
    Dado que estou na tela de compras
    Quando adiciono o produto 'Sauce Labs Backpack' no carrinho
    Então produto e adicionado ao carrinho

