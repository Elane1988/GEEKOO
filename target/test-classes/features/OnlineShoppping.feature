#Author: rsppnet@hotmail.com
@DESAFIO_RSI
Feature: Criar Conta
eu como usuario quero criar minha conta para realizar compras

@Registro

  Scenario: Registro de usuario
    Given que eu esteja no formulario de abertura de conta "http://advantageonlineshopping.com/#/ \r\n"
    When preencher os dados obrigatorios
    Then a conta sera gerada
 
@Login

Scenario: Fazer login
Given que eu esteja na pagina de login
When preencho os dados
Then vejo mensagem de sucesso
