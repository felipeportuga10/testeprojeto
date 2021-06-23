Feature:

    Functionality: <Home>

    CT-0001

    Scenario: Acessar o "Cadastre-se"

    Given  que eu estou no site "https://triosdecapacitacao.com.br/"
      And Clico em "Cadastre-se"
      And Sou Direcionado ao Formulario de "Cadastro"
      And preencho todo o "Formulario"

    When Clico em "Criar conta"

    Then Realizo Cadastro com "Sucesso"






