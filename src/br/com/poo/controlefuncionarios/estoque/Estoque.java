package br.com.poo.controlefuncionarios.estoque;

import br.com.poo.controlefuncionarios.produtos.Produto;

import java.util.ArrayList;

public class Estoque {
    private String nome;
    private ArrayList<Produto> produtos;

    public Estoque(String nome) {
        this.nome = nome;
        produtos = new ArrayList<>();

    }
    public void adicionarProduto(Produto produto){
        produtos.add(produto);
        System.out.println("Produto " + produto.getNome() + "adicionado ao estoque");
    }

    public void listarProdutos(){
        boolean existeProduto = false;
        for(Produto produto : produtos){
            System.out.println(produto.obterDados());
            existeProduto = true;
        }
        if(!existeProduto){
            System.out.println("Não há produtos no estoque");
        }
    }
    public void buscarProdutoPorNome(String nomeProduto){
        boolean encontrado = false;
        for(Produto produto : produtos){
            if(produto.getNome().equals(nomeProduto)){
                System.out.println(produto.obterDados());
                encontrado = true;
                break;
            }
        }
        if(!encontrado){
            System.out.println("Não há produto com esse nome");
        }
    }

    public double calcularValorEmEstoque(){
        double valorTotal = 0;
        for(Produto produto : produtos){
            valorTotal += produto.getPreco() * produto.getQuantidade();
        }
        return valorTotal;
    }
}
