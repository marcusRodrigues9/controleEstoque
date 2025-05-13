package br.com.poo.controlefuncionarios.produtos;

public class Computador extends Produto{
    private String modelo;
    private int qtdRam;
    private int qtdArmazenamento;

    public Computador(String nome, double preco, String descricao, int quantidade, String modelo, int qtdRam, int qtdArmazenamento) {
        super(nome, preco, descricao, quantidade);
        this.modelo = modelo;
        this.qtdRam = qtdRam;
        this.qtdArmazenamento = qtdArmazenamento;
    }

    public String obterDados(){
        return super.obterDados() + String.format(" | modelo: %s | Ram: %s | Armazenamento: %d", this.modelo, this.qtdRam, this.qtdArmazenamento);
    }


}
