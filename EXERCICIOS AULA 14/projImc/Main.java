import java.util.Scanner;
/**
 * Write a description of class Main here.
 *
 * @author (Bruno Rocha)
 * @version 1.0
 * @since 03/04/2020 - 06:10
 */
public class Main{
    public static void main(String [] args){ 
        Scanner ler= new Scanner(System.in);
        //Limpa terminal
        System.out.println("\f");
        
        //Instancia
        PesoIdeal pesoIdeal = new PesoIdeal();
        
        //Valores
        System.out.println("Digite o nome da pessoa");
        pesoIdeal.setNome(ler.nextLine());
        System.out.println(pesoIdeal.getNome()+ " seu gênero é: "
                           +"\n1. Masculino"
                           +"\n2. Feminino");
        pesoIdeal.setCodigo(ler.nextInt());
        System.out.println("Digite a altura de " +pesoIdeal.getNome());
        pesoIdeal.setAltura(ler.nextDouble());
        System.out.println("Digite o peso de " +pesoIdeal.getNome());
        pesoIdeal.setPeso(ler.nextDouble());
        
        //Saída
        System.out.println(pesoIdeal);
    }
}