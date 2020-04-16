    
    import java.util.Scanner;
    
    /**
     * Write a description of class Principal here.
     *
     * @author Thiago Cury
     * @version 1.0
     * @since 02/04/2020 - 09:33
     */
    public class Principal {
    
        public static void main(String args[]) {
    
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("\f");
        
        Calculadora calculadora = new Calculadora();

        System.out.println("\ndigite o número 1:");
        calculadora.setNumero1(scanner.nextDouble());
        System.out.println("\ndigite o número 2:");
        calculadora.setNumero2(scanner.nextDouble());
        
        System.out.println("\nDigite a opcao:"
                         + "\n1-somar"
                         + "\n2-subtrair"
                         + "\n3-dividir"
                         + "\n4-multiplicar"
                         + "\n5-todos");
        int opcao = scanner.nextInt();
        
        System.out.println(calculadora.verificarOpcao(opcao));
        
        //nao usa mais.
        //System.out.println(calculadora);
        
    }
    
}
