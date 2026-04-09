package org.example.prova02;

import java.util.ArrayList;
import java.util.List;

public class Estoque {

    private List<Produto> produtos = new ArrayList<>();

    public void adicionarProduto(Produto p) {
        produtos.add(p);
    }

    public void listarProdutos() {
        for (Produto produto : produtos) {
            System.out.println(produto.exibirInfo());
        }
    }

    public double calcularTotalImpostos() {
        double totalImposto = 0;
        for (Produto produto : produtos) {
            if (produto instanceof Tributavel) {
                totalImposto += ((Tributavel) produto).calcularImposto();
            }
        }
        return totalImposto;
    }
}
