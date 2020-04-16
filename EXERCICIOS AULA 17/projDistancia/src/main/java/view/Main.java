import java.util.Scanner;
/**
 * Write a description of class Main here.
 *
 * @authors (Bruno Rocha, Peterson Peres e Thiago Dias)
 * @version 1.0
 * @since 08/04/2020 - 11:31
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Limpa o Terminal
        System.out.println("\f");

        //Instancia
        Distancia distancia = new Distancia();

        //Valores
        System.out.println("Digite x1");
        distancia.setX1(scanner.nextDouble());
        System.out.println("Digite y1");
        distancia.setY1(scanner.nextDouble());
        System.out.println("Digite x2");
        distancia.setX2(scanner.nextDouble());
        System.out.println("Digite o y2");
        distancia.setY2(scanner.nextDouble());

        //Saída
        System.out.println(distancia);
    }
}
