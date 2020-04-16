package view;
import model.Posto;
import java.util.Scanner;
/**
 * Write a description of class Main here.
 *
 * @authors (Bruno Rocha, Peterson Peres e Thiago Dias)
 * @version 1.0
 * @since 09/04/2020 - 09:26
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Limpa o Terminal
        System.out.println("\f");

        //Instancia
        Posto posto = new Posto();

        //Entrada
        System.out.println("Digite o código do tipo de combustível "
                +"\n1. Gasolina"
                +"\n2. Álcool"
                +"\n3. Diesel"
                +"\n4. Flex");
        posto.setCodigo(scanner.nextByte());
        System.out.println("Digite a quantidade de "+posto.tipoDeCombustivel()+" em litros requerida");
        posto.setLitros(scanner.nextDouble());

        //Saída
        System.out.println(posto);
    }
}
