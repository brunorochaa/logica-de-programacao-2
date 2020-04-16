import java.util.Scanner;
/**
 *
 * @author Bruno
 */
public class Main {
    public static void main(String[] args) {
        Scanner ler= new Scanner(System.in);
        System.out.println("\f");
        
        LampadaIncandescente lampadaincandescente = new LampadaIncandescente();
        lampadaincandescente.setMarca("Osram");
        lampadaincandescente.setState("Ligada!");
        System.out.println(lampadaincandescente); //toString
        
        LampadaLED lampadaled = new LampadaLED();
        lampadaled.setState("Desligada.");
        System.out.println(lampadaled); //toString
    }
}