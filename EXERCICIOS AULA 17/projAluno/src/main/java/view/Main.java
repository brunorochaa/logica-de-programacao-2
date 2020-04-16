import java.util.Scanner;
/**
 * Write a description of class Main here.
 *
 * @authors (Bruno Rocha, Peterson Peres e Thiago Dias)
 * @version 1.0
 * @since 08/04/2020 - 10:10
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Limpa terminal
        System.out.println("\f");

        //Instancia
        Aluno aluno = new Aluno();

        //Valores
        System.out.println("Digite o nome do aluno");
        aluno.setNome(scanner.next());

        double nota;
        for(int i=0; i<aluno.getNota().length; i++){
            do{
                System.out.println("Digite a "+(i+1)+"ª nota: ");
                nota= scanner.nextDouble();
                if(nota<0 || nota>10){
                    System.out.println("Erro!");
                }
            }while(nota<0 || nota>10);
            aluno.cadastrar(i, nota);
        }

        //Saída
        System.out.println(aluno);
    }
}