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
        Calculadora calculadora = new Calculadora();
        
        //Valores
        System.out.println("Digite o Valor 1");
        calculadora.valor1= ler.nextDouble();
        System.out.println("Digite o Valor 2");
        calculadora.valor2= ler.nextDouble();
        
        //Menu 
        byte menu;
            
        do{
            System.out.println("Escolha: "
                          +"\n1. Mostrar Valor 1"
                          +"\n2. Mostrar Valor 2"
                          +"\n3. Mostrar Soma"
                          +"\n4. Mostrar Subtração"
                          +"\n5. Mostrar Multiplição"
                          +"\n6. Mostrar Divisão"
                          +"\n0. Sair");
            menu= ler.nextByte();
            
            switch (menu){
                case 1:
                    System.out.println("\nVisualizando Valor 1...");
                    System.out.println("" +calculadora.valor1);
                    break;
                    
                case 2:
                    System.out.println("\nVisualizando Valor 2...");
                    System.out.println("" +calculadora.valor2);
                    break;
                    
                case 3:
                    System.out.println("\nVisualizando Soma...");
                    System.out.println("" +calculadora.somarValores());
                    break;
                    
                case 4:
                    System.out.println("\nVisualizando Subtração...");
                    System.out.println("" +calculadora.subtrairValores());
                    break;
                    
                case 5:
                    System.out.println("\nVisualizando Multiplição...");
                    System.out.println("" +calculadora.multiplicarValores());
                    break;
                    
                case 6:
                    System.out.println("\nVisualizando Divisão...");
                    System.out.println("" +calculadora.dividirValores());
                    break;

                case 0:
                System.out.println("Tchau, volte sempre!");
            }
        }while(menu!=0);
    } 
}