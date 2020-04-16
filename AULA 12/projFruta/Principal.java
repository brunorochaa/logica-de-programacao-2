import java.util.Scanner;
/**
 * @author Thiago Cury
 * @version 1.0
 * @since 01/04/2020 - 09:30
 */
public class Principal {
    
    public static void main(String args[]) {
    
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("\f");
        
        Banana banana = new Banana();
        System.out.println("Digite a cor da fruta: ");
        banana.setCor(scanner.nextLine()); //user
        System.out.println(banana);
        
        Morango morango = new Morango();
        System.out.println("Digite a cor da fruta: ");
        morango.setCor(scanner.nextLine());
        System.out.println(morango);
        
    }
}