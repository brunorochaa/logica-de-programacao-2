import java.util.Scanner;
/**
 *
 * @author Bruno
 */
public class Main {
    public static void main(String[] args) {
        Scanner ler= new Scanner(System.in);
        System.out.println("\f");

        //Instancia
        Produto produto = new Produto();

        //Valor
        System.out.println("Digite a descrição do produto");
        produto.descricao= ler.next();
        System.out.println("Digite o valor do produto");
        produto.valor= ler.nextFloat();
        System.out.println("Digite a quantidade do produto");
        produto.quantidade= ler.nextInt();

        //Saída
        System.out.println("Descrição do Produto " +produto.descricao);
        System.out.println("Valor do Produto " +produto.valor);
        System.out.println("Quantidade de Produtos " +produto.quantidade);
        System.out.println("Valor Total de Estoque " +produto.calcularEstoque());
    }
}