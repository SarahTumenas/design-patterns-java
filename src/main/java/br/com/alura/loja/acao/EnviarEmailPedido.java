package br.com.alura.loja.acao;

import br.com.alura.loja.pedido.Pedido;

public class EnviarEmailPedido implements AcaoAposGerarPedido {

    public void executarAcao(Pedido pedido) {
        //seria a lógica de enviar o email para o cliente
        System.out.println("Enviar email com dados do pedido: ");
    }
}
