package br.com.alura.loja;


import br.com.alura.loja.pedido.GeraPedido;

import java.math.BigDecimal;

public class TestesPedidos {

    public static void main(String[] args) {
        //simulando a interface de linha de comando
        String cliente =args[0];
        BigDecimal valorOrcamento = new BigDecimal(args[1]);
        int quantidadeItens = Integer.parseInt(args[2]);

        GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
        gerador.executa();

    }
}
