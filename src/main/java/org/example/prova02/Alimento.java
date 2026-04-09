package org.example.prova02;

public class Alimento extends Produto {

    private String marca;
    private String validade;

    public Alimento(String nome, double preco, String marca, String validade) {
        super(nome, preco);
        this.marca = marca;
        this.validade = validade;
    }

    public String getMarca() {
        return marca;
    }

    @Override
    public String categoria() {
        return "Alimento";
    }

    @Override
    public String exibirInfo() {
        return super.exibirInfo() + " | Validade: " + validade + " | Categoria: " + categoria();
    }
}
