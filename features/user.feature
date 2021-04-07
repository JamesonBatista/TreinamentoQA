Feature: Validar dados do Usuario

  Scenario: Validacoes

    Given que seja acessado o endpoint "/api/users/7"
    When for validado o nome do usuario igual a "Michael"
    Then a url do support sera igual a "https://reqres.in/#support-heading"