package view;
import java.util.List;
import java.util.Scanner;
import dao.BancoArrayProduto;
import model.Produto;
/**
 * Write a description of class Main here.
 *
 * @authors (Bruno Rocha, Peterson Peres e Thiago Dias)
 * @version 1.0
 * @since 08/04/2020 - 17:42
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Limpa Tela
        System.out.println("\f");

        //Instancia do Banco
        BancoArrayProduto estoque = new BancoArrayProduto();

        Produto produto = null;

        //Entrada
        System.out.println("Seja Bem-Vindo!");
        //Menu
        byte menu;
        do{
            System.out.println("1. Cadastrar"
                    +"\n2. Ver Produto"
                    +"\n3. Deletar Produto"
                    +"\n4. Filtrar Produto"
                    +"\n5. Ver Quantidade de Produtos"
                    +"\n6. Esvaziar Produto"
                    +"\n0. Sair");
            menu= scanner.nextByte();
            switch(menu){
                case 1:
                    System.out.println("Cadastrando Produto...");
                    produto = new Produto();
                    System.out.println("Digite o nome do produto");
                    produto.setNome(scanner.next());
                    System.out.println("Digite a quantidade do produto");
                    produto.setQuantidade(scanner.nextInt());
                    System.out.println("Digite o valor do produto");
                    produto.setValor(scanner.nextDouble());
                    estoque.cadastrar(produto);
                    System.out.println("Produto Cadastrado com Sucesso!");
                    break;
                case 2:
                    System.out.println("Visualizando Produto...");
                    List<Produto> produtos = estoque.buscar();
                    if (produtos.isEmpty()) {
                        System.out.println("Não há Produtos!");
                    } else {
                        for (Produto produtoAuxiliar: produtos) {
                            System.out.println(produtoAuxiliar.toString());
                        }
                    }
                    break;
                case 3:
                    System.out.println("Deletando Produtos...");
                    System.out.println("Digite a posição");
                    estoque.excluir(scanner.nextInt());
                    System.out.println("Produto Apagado com Sucesso!");
                    break;
                case 4:
                    System.out.println("Filtrando Produtos...");
                    produto = new Produto();
                    System.out.println("Digite o nome do produto para filtrar: ");
                    produto.setNome(scanner.next());
                    produto = estoque.filtrar(produto, 1);
                    System.out.println(produto != null ? produto.toString() : "Produto não encontrado!");
                    break;
                case 5:
                    System.out.println("Visualizando Quantidade de Produtos...");
                    System.out.println("Quantidade de produtos(s) no estoque: " + estoque.verificarQuantidadeDeProdutos());
                    break;
                case 6:
                    estoque.apagarProduto();
                    System.out.println("Produto apagada com sucesso!");
                    break;
                case 0:
                    System.out.println("Tchau, volte logo!");
                    break;
                default:
                    System.out.println("Inválido");
                    break;
            }
        }while(menu!=0);
    }
}