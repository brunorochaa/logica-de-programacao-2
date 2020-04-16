import java.util.Scanner;
/**
 *
 * @author Bruno
 */
public class Main {
    public static void main(String[] args) {
        Scanner ler= new Scanner(System.in);
        System.out.println("\f");
        
        Aluno aluno = new Aluno();
        aluno.setNome("Bruno");
        aluno.setSobrenome("Rocha");
        aluno.setEmail("brunorochaamaral@gmail.com");
        aluno.setDataDeNascimento("29/11/0000");
        aluno.nota1 = 7;
        aluno.nota2 = 7;
        System.out.println(aluno);
        
        Funcionario funcionario = new Funcionario();
        funcionario.numeroDeRegistro = 7;
        funcionario.setNome("Cristiano");
        funcionario.setSobrenome("Ronaldo");
        funcionario.setEmail("cronaldo@gmail.com");
        funcionario.setDataDeNascimento("29/11/0000");
        funcionario.salarioFixo = 998.00;
        System.out.println(funcionario);
        
        Professor professor = new Professor();
        professor.numeroDeRegistro = 7;
        professor.setNome("Thiago");
        professor.setSobrenome("Curry");
        professor.setEmail("thiago.curry@qi.edu.br");
        professor.setDataDeNascimento("29/11/0000");
        professor.numeroDeHorasTrabalhadas = 44;
        professor.valorHora = 8;
        System.out.println(professor);
    }
}