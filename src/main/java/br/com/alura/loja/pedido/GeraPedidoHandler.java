package br.com.alura.loja.pedido;

import br.com.alura.loja.acao.EnviarEmailPedido;
import br.com.alura.loja.acao.SalvarPedidoNoBancoDeDados;
import br.com.alura.loja.orcamento.Orcamento;

import java.time.LocalDateTime;

public class GeraPedidoHandler {
    //construtor com injecao de dependencias: Repository, Service, etc .

    public void execute(GeraPedido dados){

        Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQuantidadeItens());

        Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);

        EnviarEmailPedido enviarEmailPedido = new EnviarEmailPedido();
        SalvarPedidoNoBancoDeDados salvarPedidoNoBancoDeDados = new SalvarPedidoNoBancoDeDados();
        enviarEmailPedido.executar(pedido);
        salvarPedidoNoBancoDeDados.executar(pedido);

    }
}
