package org.example;

import org.example.prova02.Alimento;
import org.example.prova02.Eletronico;
import org.example.prova02.Estoque;

public class Main {
    public static void main(String[] args) {

        /*
        Carro carro = new Carro("Fiat", "Palio", 2010, 4, 20000);
        System.out.println(carro.exibirInfo());
        System.out.println(String.format("IPVA do Carro: R$ %.2f", carro.calcularIPVA()));

        Moto moto = new Moto("Honda", "CB500", 2018, 15000, "500cc");
        System.out.println(moto.exibirInfo());
        System.out.println(String.format("IPVA da Moto: R$ %.2f", moto.calcularIPVA()));


        try {
            Carro carroInvalido = new Carro("Ford", "Model T", 1899, 2, 10000);
        } catch (AnoInvalidoException e) {
            System.out.println(e.getMessage());
        }

         */
        Eletronico eletronico = new Eletronico("Smartphone", 1500, "Samsung");
        Eletronico eletronico1 = new Eletronico("Notebook", 3500, "Dell");
        Alimento alimento = new Alimento("Chocolate", 10, "Nestlé", "2024-12-31");

        Estoque estoque = new Estoque();
        estoque.adicionarProduto(eletronico);
        estoque.adicionarProduto(eletronico1);
        estoque.adicionarProduto(alimento);
        estoque.listarProdutos();
        System.out.println("Total de Impostos: R$ " + String.format("%.2f", estoque.calcularTotalImpostos()));
    }
}
