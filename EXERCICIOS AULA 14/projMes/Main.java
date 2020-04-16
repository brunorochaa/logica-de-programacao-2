import java.util.Scanner;
/**
 * Write a description of class Main here.
 *
 * @author (Bruno Rocha)
 * @version 1.0
 * @since 03/04/2020 - 01:44
 */
public class Main{
    public static void main(String [] args){ 
        Scanner ler= new Scanner(System.in);
        //Limpa terminal
        System.out.println("\f");
        
        //Instancia
        Mes mes = new Mes();
        
        //Valores
        System.out.println("Digite o número do mês");
        mes.setMes(ler.nextByte());
        
        //Saída
        System.out.println(mes);
    }
}