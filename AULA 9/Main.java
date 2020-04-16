import java.util.Scanner;
/**
 *
 * @author Bruno
 */
public class Main {
    public static void main(String[] args) {
        Scanner ler= new Scanner(System.in);
        System.out.println("\f");

        byte menu;
        System.out.println("Escolha:"
                 +"\n1. Cadastrar Pessoa"
                 +"\n2. Cadastrar Aluno"
                 +"\n3. Cadastrar Professor"
                 +"\n4. Cadastrar Funcionário"
                 +"\n0. Sair");
        menu= ler.nextByte();
        switch(menu){
             case 1:
                System.out.println("Cadastrando Pessoa...");
                //Instancia
                Pessoa pessoa = new Pessoa();
                //Valores
                System.out.println("Digite seu nome");
                ler.nextLine();
                pessoa.setNome(ler.nextLine());
                System.out.println("Digite seu sobrenome");
                pessoa.setSobrenome(ler.nextLine());
                System.out.println("Digite seu email");
                pessoa.setEmail(ler.nextLine());
                //Saída
                System.out.println(pessoa);
                break;
                
             case 2:
                System.out.println("Cadastrando Aluno...");
                //Instancia
                Aluno aluno = new Aluno();
                //Valores
                System.out.println("Digite N1");
                aluno.setNota1(ler.nextFloat());
                System.out.println("Digite N2");
                aluno.setNota2(ler.nextFloat());
                //Saída
                System.out.println(aluno);
                break;
             case 3:
                System.out.println("Cadastrando Professor...");
                //Instancia
                Professor professor = new Professor();
                //Valores
                System.out.println("Digite o Número de Registro do Professor");
                professor.setNumeroDeRegistro(ler.nextInt());
                System.out.println("Digite o Número de Horas Trabalhadas");
                professor.setNumeroDeHorasTrabalhadas(ler.nextDouble());
                System.out.println("Digite o Valor Hora");
                professor.setValorHora(ler.nextDouble());
                //Saída
                System.out.println(professor);
                break;
             case 4:
                System.out.println("Cadastrando Funcionário...");
                //Instancia
                Funcionario funcionario = new Funcionario();
                //Valores
                System.out.println("Digite o Número de Registro do Funcionário");
                funcionario.setNumeroDeRegistro(ler.nextInt());
                System.out.println("Digite o Salário Fixo");
                funcionario.setSalarioFixo(ler.nextDouble());
                //Saída
                System.out.println(funcionario);
                break;
             case 0:
                System.out.println("Saindo...");
                break;
             default:
                System.out.println("Opção inválida, ANIMAL!");
        }
    }
}