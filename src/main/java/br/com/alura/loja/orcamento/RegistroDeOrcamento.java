package br.com.alura.loja.orcamento;

import br.com.alura.loja.DomainException;
import br.com.alura.loja.http.HttpAdapter;

import java.util.Map;

public class RegistroDeOrcamento {

    private HttpAdapter http;

    public RegistroDeOrcamento(HttpAdapter http) {
        this.http = http;
    }

    public void registrar(Orcamento orcamento){

        //chamda Http para a API externa
        //URL Connection - java puro
        //Http Client biblioteca do apache
        //lib Rest

        if (!orcamento.isFinalizado()) {
            throw new DomainException("Orçamento não finalizado!");
        }

        String url = "http://api.externa/orcamentos";
        Map<String, Object> dados = Map.of(
               "valor", orcamento.getValor(),
               "quantidadeItens", orcamento.getQuantidadeItens()
        );

        http.post(url,dados);

    }
}
