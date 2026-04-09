package org.example.prova02;

public class Eletronico extends Produto implements Tributavel {

    private String marca;

    public Eletronico(String nome, double preco, String marca) {
        super(nome, preco);
        this.marca = marca;
    }

    @Override
    public String categoria() {
        return "Eletrônico";
    }

    @Override
    public double calcularImposto() {
        return getPreco() * 0.15;
    }

    @Override
    public String exibirInfo() {
        return super.exibirInfo() + " | Marca: " + marca + " | Categoria: " + categoria();
    }
}
