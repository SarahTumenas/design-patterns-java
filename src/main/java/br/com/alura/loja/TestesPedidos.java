package br.com.alura.loja;

import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.pedido.Pedido;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class TestesPedidos {

    public static void main(String[] args) {

        Orcamento orcamento = new Orcamento(new BigDecimal("500"), 4);
        String cliente = "Ana da Silva";
        LocalDateTime data = LocalDateTime.now();
        Pedido pedido = new Pedido(cliente, data, orcamento);

        System.out.println("Salvar pedido");
        System.out.println("Enviar email");


    }
}
