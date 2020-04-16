import java.util.Scanner;
/**
 * Write a description of class Main here.
 *
 * @author (Bruno Rocha)
 * @version 1.0
 * @since 03/04/2020 - 03:58
 */
public class Main{
    public static void main(String [] args){ 
        Scanner ler= new Scanner(System.in);
        //Limpa terminal
        System.out.println("\f");
        
        //Instancia
        Caixa caixa = new Caixa();
        
        //Valores
        System.out.println("Digite o código do produto"
                           +"\n1. Sanduíche de Presunto - R$ 3,65"
                           +"\n2. Suco de Tamarindo - R$ 2,50"
                           +"\n3. Pastel com ovo - R$ 3,30"
                           +"\n4. Farroupilha - R$ 4,70");
        caixa.setCodigo(ler.nextInt());
        System.out.println("Digite a quantidade");
        caixa.setQuantidade(ler.nextInt());
        //Saída
        System.out.println(caixa);
    }
}