package view;
import model.Trimestre;
import java.util.Scanner;
/**
 * Write a description of class Main here.
 *
 * @authors (Bruno Rocha, Peterson Peres e Thiago Dias)
 * @version 1.0
 * @since 09/04/2020 - 08:22
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Limpa Terminal
        System.out.println("\f");

        //Instancia
        Trimestre trimestre = new Trimestre();

        //Entrada
        System.out.println("Escreva o mês em que você nasceu");
        trimestre.setMes(scanner.nextLine());

        //Saída
        System.out.println(trimestre);
    }
}
