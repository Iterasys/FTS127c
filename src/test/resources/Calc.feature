#language: pt
#encoding: utf-8

Funcionalidade: Somar

  Esquema do Cenario: Somar Dois Numeros
    Dado que abro a calculadora
    Quando digito <num1>
    E clico em Somar
    E digito <num2>
    Quando clico no Igual
    Entao exibe o <resultado>

    Exemplos:
      | num1 | num2 | resultado |
      | "2"  | "3"  | "5"       |
      | "7"  | "8"  | "15"      |