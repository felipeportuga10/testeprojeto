#language: pt
#enconding: UTF-8
#date: 10/05/2020
#author: Filipe vieira emiliano
#version: 1.0
Caracteristica:

  Funcionalidade: <Login>

  CT-0002

  Cenario: Efetuar o "Login"

    Dado que eu estou no site "https://triosdecapacitacao.eadplataforma.com/login/"
      E Preencho "Email e Senha"

    Quando Clico no Botao "Entrar"

    Entao Realizo Login com "Sucesso"