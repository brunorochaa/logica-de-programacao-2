package view;
import model.Nadador;
import java.util.Scanner;
/**
 * Write a description of class Main here.
 *
 * @authors (Bruno Rocha, Peterson Peres e Thiago Dias)
 * @version 1.0
 * @since 09/04/2020 - 10:41
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Limpa Terminal
        System.out.println("\f");

        //Instancia
        Nadador nadador = new Nadador();

        //Entrada
        System.out.println("Digite o nome do nadador");
        nadador.setNome(scanner.nextLine());
        System.out.println("Digite a idade do nadador");
        nadador.setIdade(scanner.nextByte());

        //Saída
        System.out.println(nadador);
    }
}