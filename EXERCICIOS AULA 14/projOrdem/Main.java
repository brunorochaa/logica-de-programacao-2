import java.util.Scanner;
/**
 * Write a description of class Main here.
 *
 * @author (Bruno Rocha)
 * @version 1.0
 * @since 03/04/2020 - 19:25
 */
public class Main{
    public static void main(String [] args){ 
        Scanner ler= new Scanner(System.in);
        //Limpa terminal
        System.out.println("\f");
        
        //Instancia
        Ordem ordem = new Ordem();
        
        //Menu
        byte menu;
        do{
            System.out.println("1. Cadastrar Valores"
                     +"\n2. Ver Crescente"
                     +"\n3. Ver Decrescente"
                     +"\n4. Ver ambas"
                     +"\n0. Sair");
            menu= ler.nextByte();
            switch(menu){
                case 1:
                    int valor;
                     for(int i=0; i<ordem.getValor().length; i++){
                     do{
                        System.out.println("Digite o "+(i+1)+"º valor: ");
                        valor = ler.nextInt();
                        if(valor<0){
                         System.out.println("Erro!");
                        }
                     }while(valor<0);
                     ordem.cadastrar(i, valor);
                    }
                    break;
                case 2:
                    System.out.println("Visualizando em ordem crescente...");
                    ordem.ordemCrescente();
                    System.out.println(ordem);
                    break;
                case 3:
                    System.out.println("Visualizando em ordem crescente...");
                    ordem.ordemDecrescente();
                    System.out.println(ordem);
                    break;
                case 4:
                    System.out.println("Visualizando ambos...");
                    ordem.ordemCrescente();
                    ordem.ordemDecrescente();
                    System.out.println(ordem);
                    break;
                case 0:
                    System.out.println("Tchau, volte logo!");
                    break;
                default:
                    System.out.println("Inválido");
                    break;
            }
        }while(menu!=0);
        
        //Saída
        System.out.println(ordem);
    }
}