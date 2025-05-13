package br.com.poo.controlefuncionarios.produtos;

import java.util.Scanner;

public class Produto {
    private String nome;
    private double preco;
    private String descricao;
    private int quantidade;

    public Produto(String nome, double preco, String descricao, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.descricao = descricao;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public String obterDados(){
        return String.format("Nome: %s | preço: %.2f | descrição: %s | quantidade: %d",this.nome, this.preco, this.descricao, this.quantidade);
    };

}
