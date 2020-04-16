import java.util.Scanner;
import java.text.DecimalFormat;

public class Principal {
    
    public static void main(String args[]) {
    
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("\f");
        
        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.setTaxa(1);
        contaCorrente.setSaldo(1000);
        //fazer operacoes de depósito ou saque
        contaCorrente.sacar(1000);
        contaCorrente.depositar(100);
        System.out.println(contaCorrente);
 
        ContaPoupanca contaPoupanca = new ContaPoupanca();
        contaPoupanca.setSaldo(1000.19);
        System.out.println(contaPoupanca);
        
        //linguagem de programacao C
        System.out.printf("%.2f", contaPoupanca.getSaldo());

        //linguagem de programacao java
        DecimalFormat decimalFormat = new DecimalFormat("#0.00");
        System.out.println("\n");
        System.out.printf(decimalFormat.format(contaPoupanca.getSaldo()));
        
    }
}