import java.util.Scanner;
/**
 * Write a description of class Main here.
 *
 * @author (Bruno Rocha)
 * @version 1.0
 * @since 03/04/2020 - 04:40
 */
public class Main{
    public static void main(String [] args){ 
        Scanner ler= new Scanner(System.in);
        //Limpa terminal
        System.out.println("\f");
        
        //Instancia
        Aluno aluno = new Aluno();
        
        //Valores
        System.out.println("Digite o nome do aluno");
        aluno.setNome(ler.nextLine());
        System.out.println("Digite o sobrenome de "+aluno.getNome());
        aluno.setSobrenome(ler.nextLine());
        System.out.println("Digite a N1 de "+aluno.getNome()+ " "+aluno.getSobrenome());
        aluno.setNota1(ler.nextDouble());
        System.out.println("Digite a N2 de "+aluno.getNome()+ " "+aluno.getSobrenome());
        aluno.setNota2(ler.nextDouble());
        
        //Saída
        System.out.println(aluno);
    }
}