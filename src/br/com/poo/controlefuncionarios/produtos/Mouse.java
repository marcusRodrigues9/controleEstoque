package br.com.poo.controlefuncionarios.produtos;

public class Mouse extends Produto{
    private String tipo;
    private int qtdDpi;

    public Mouse(String nome, double preco, String descricao, int quantidade, String tipo, int qtdDpi) {
        super(nome, preco, descricao, quantidade);
        this.tipo = tipo;
        this.qtdDpi = qtdDpi;
    }

    public String obterDados(){
        return super.obterDados() + String.format(" | Tipo: %s | DPI: %d", this.tipo, this.qtdDpi);
    }
}
