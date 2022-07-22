package br.com.alura.loja;

import br.com.alura.loja.desconto.CalculadoraDeDescontos;
import br.com.alura.loja.orcamento.Orcamento;


import java.math.BigDecimal;

public class TesteDescontos {

    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento();

        Orcamento orcamento2 = new Orcamento();

        Orcamento orcamento3 = new Orcamento();

        CalculadoraDeDescontos calculadora = new CalculadoraDeDescontos();

        System.out.println(calculadora.calcular(orcamento));

        System.out.println(calculadora.calcular(orcamento2));

        System.out.println(calculadora.calcular(orcamento3));
    }
}
