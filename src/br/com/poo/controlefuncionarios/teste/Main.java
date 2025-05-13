package br.com.poo.controlefuncionarios.teste;

import br.com.poo.controlefuncionarios.estoque.Estoque;
import br.com.poo.controlefuncionarios.produtos.Computador;
import br.com.poo.controlefuncionarios.produtos.Mouse;
import br.com.poo.controlefuncionarios.produtos.Produto;
import br.com.poo.controlefuncionarios.produtos.Teclado;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Estoque estoque = new Estoque("Estoque produtos");

        int opcao = -1;
        while( opcao != 0){
            System.out.println("Escolha uma opção");
            System.out.println("1 - cadastrar Computador");
            System.out.println("2 - cadastrar Teclado");
            System.out.println("3 - cadastrar Mouse");
            System.out.println("4 - listar produtos");
            System.out.println("5 - buscar produto por nome");
            System.out.println("6 - calcular valor em estoque");
            System.out.println("0 - sair do sistema");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao){
                case 1:
                    System.out.println("Cadastrar computador");

                    System.out.println("Digite o nome: ");
                    String nome = scanner.nextLine();

                    System.out.print("Digite o preço: ");
                    double preco = Double.parseDouble(scanner.nextLine());

                    System.out.print("Digite a descrição: ");
                    String descricao = scanner.nextLine();

                    System.out.print("Digite a quantidade: ");
                    int quantidade = scanner.nextInt();
                    scanner.nextLine(); // Consumir quebra de linha

                    System.out.print("Digite o modelo: ");
                    String modelo = scanner.nextLine();

                    System.out.print("Digite a quantidade de RAM (em GB): ");
                    int qtdRam = scanner.nextInt();

                    System.out.print("Digite a quantidade de armazenamento (em GB): ");
                    int qtdArmazenamento = scanner.nextInt();
                    scanner.nextLine(); // Consumir quebra de linha

                    Computador computador = new Computador(nome, preco, descricao, quantidade, modelo, qtdRam, qtdArmazenamento);
                    estoque.adicionarProduto(computador);

                    System.out.println("Computador cadastrado com sucesso!");
                    break;

                case 2:
                    System.out.println("Cadastrar teclado");

                    System.out.println("Digite o nome: ");
                    String nomeTeclado = scanner.nextLine();

                    System.out.print("Digite o preço: ");
                    double precoTeclado = Double.parseDouble(scanner.nextLine());

                    System.out.print("Digite a descrição: ");
                    String descricaoTeclado = scanner.nextLine();

                    System.out.print("Digite a quantidade: ");
                    int quantidadeTeclado = scanner.nextInt();
                    scanner.nextLine(); // Consumir quebra de linha

                    System.out.print("Tipo de conexão: ");
                    String tipoConexao = scanner.nextLine();

                    System.out.print("Digite a quantidade de teclas: ");
                    int qtdTeclas = scanner.nextInt();
                    scanner.nextLine();
                    Teclado teclado = new Teclado(nomeTeclado, precoTeclado, descricaoTeclado, quantidadeTeclado, tipoConexao, qtdTeclas);
                    estoque.adicionarProduto(teclado);

                    System.out.println("Teclado cadastrado com sucesso!");
                    break;
                case 3:
                    System.out.println("Cadastrar Mouse");

                    System.out.println("Digite o nome: ");
                    String nomeMouse = scanner.nextLine();

                    System.out.print("Digite o preço: ");
                    double precoMouse = Double.parseDouble(scanner.nextLine());

                    System.out.print("Digite a descrição: ");
                    String descricaoMouse = scanner.nextLine();

                    System.out.print("Digite a quantidade: ");
                    int quantidadeMouse = scanner.nextInt();
                    scanner.nextLine(); // Consumir quebra de linha

                    System.out.print("Tipo do mouse: ");
                    String tipoMouse = scanner.nextLine();

                    System.out.print("Digite o DPI: ");
                    int dpiMouse = scanner.nextInt();
                    scanner.nextLine();
                    Mouse mouse = new Mouse(nomeMouse, precoMouse, descricaoMouse, quantidadeMouse, tipoMouse, dpiMouse);
                    estoque.adicionarProduto(mouse);

                    System.out.println("Teclado cadastrado com sucesso!");
                    break;

                case 4:
                    estoque.listarProdutos();
                    break;
                case 5:
                    System.out.println("Nome produto procurado:  ");
                    String nomeProcurado = scanner.nextLine();
                    estoque.buscarProdutoPorNome(nomeProcurado);
                    break;
                case 6:
                    System.out.println(estoque.calcularValorEmEstoque());
                    break;
            }
        }

    }
}