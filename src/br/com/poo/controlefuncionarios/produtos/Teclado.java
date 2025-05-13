package br.com.poo.controlefuncionarios.produtos;

public class Teclado extends Produto{
    private String tipoConexao;
    private int qtdTeclas;

    public Teclado(String nome, double preco, String descricao, int quantidade, String tipoConexao, int qtdTeclas) {
        super(nome, preco, descricao, quantidade);
        this.tipoConexao = tipoConexao;
        this.qtdTeclas = qtdTeclas;
    }

    public String obterDados(){
        return super.obterDados() + String.format("| Tipo de conexão: %s | quantidade teclas: %s", this.tipoConexao, this.qtdTeclas);
    }
}
