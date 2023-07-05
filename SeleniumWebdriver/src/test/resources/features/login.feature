# language: pt

  @login
  Funcionalidade: Login
    Eu como usuário do sistema
    Quero fazer login
    Para fazer uma compra no site

    Esquema do Cenario: Login - sucesso
      Dado que estou na tela de login
      Quando preencho login '<usuario>' e senha '<senha>'
      E clico em Login
      Então vejo mensagem de login com sucesso

      Exemplos:
      |   usuario   |    senha   |
      |standard_user|secret_sauce|


