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
        Aluno aluno = new Aluno();
        
        //Valores
        System.out.println("Digite o nome do aluno");
        aluno.nome= ler.nextLine();
        System.out.println("Digite a N1 de: "+aluno.nome);
        aluno.nota1= ler.nextFloat();
        System.out.println("Digite a N2 de: "+aluno.nome);
        aluno.nota2= ler.nextFloat();
        
        //Menu 
        byte menu;
            
        do{
            System.out.println("Escolha: "
                          +"\n1. Mostrar Nome"
                          +"\n2. Mostrar N1"
                          +"\n3. Mostrar N2"
                          +"\n4. Mostrar Média"
                          +"\n0. Sair");
            menu= ler.nextByte();
            
            switch (menu){
                case 1:
                    System.out.println("\nVisualizando Nome do Aluno...");
                    System.out.println("" +aluno.nome);
                    break;
                    
                case 2:
                    System.out.println("\nVisualizando N1...");
                    System.out.println("" +aluno.nota1);
                    break;
                    
                case 3:
                    System.out.println("\nVisualizando N2...");
                    System.out.println("" +aluno.nota2);
                    break;
                    
                case 4:
                    System.out.println("\nMostrar Média Aritmética...");
                    System.out.println(aluno.nome+ " teve média: " +aluno.calcularMedia());
                    System.out.println(aluno.nome+ " foi "+aluno.resposta());
                    break;

                case 0:
                System.out.println("Tchau, volte sempre!");
            }
        }while(menu!=0);
    } 
}
