package br.com.alura.loja;

import br.com.alura.loja.desconto.CalculadoraDeDescontos;
import br.com.alura.loja.orcamento.Orcamento;


import java.math.BigDecimal;

public class TesteDescontos {

    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("200"), 6);

        Orcamento orcamento2 = new Orcamento(new BigDecimal("200"), 4);

        Orcamento orcamento3 = new Orcamento(new BigDecimal("600"), 4);

        CalculadoraDeDescontos calculadora = new CalculadoraDeDescontos();

        System.out.println(calculadora.calcular(orcamento));

        System.out.println(calculadora.calcular(orcamento2));

        System.out.println(calculadora.calcular(orcamento3));
    }
}
