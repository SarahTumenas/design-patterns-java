package br.com.alura.loja.pedido.acao;

import br.com.alura.loja.pedido.Pedido;

public class SalvarPedidoNoBancoDeDados implements AcaoAposGerarPedido {

    //seria a lógica de salvar o pedido no banco de dados

    public void executarAcao(Pedido pedido) {
        System.out.println("Salvando pedido no banco de dados ");
    }
}
