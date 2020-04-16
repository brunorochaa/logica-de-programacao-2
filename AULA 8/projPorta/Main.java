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
        Porta porta = new Porta();
        
        //Valores
        System.out.println("Digite a cor da porta");
        porta.cor= ler.next();
        System.out.println("Digite a dimensão x da porta");
        porta.dimensaoX= ler.nextFloat();
        System.out.println("Digite a dimensão y da porta");
        porta.dimensaoY= ler.nextFloat();
        System.out.println("Digite a dimensão z da porta");
        porta.dimensaoZ= ler.nextFloat();
        //Menu Status da Porta
        byte menu;
        System.out.println("Escolha o Status da Porta"
                 +"\n1. Aberta"
                 +"\n2. Fechada");
        menu= ler.nextByte();
        switch(menu){
             case 1:
                porta.abre();
                break;
             case 2:
                porta.fecha();
                break;
             default:
                    System.out.println("Status inválido, seu jumento!");
        }
        
        //Saída
        System.out.println(porta);
    }
}