import java.util.Scanner;
/**
 *
 * @author Bruno
 */
public class Main {
    public static void main(String[] args) {
        Scanner ler= new Scanner(System.in);
        System.out.println("\f");
        
        //Instancia 
        ContaBancaria contaBancaria = new ContaBancaria();
        
        
        //Valores
        do{
            System.out.println("Digite o limite: ");
            contaBancaria.limite= ler.nextDouble();
            if(contaBancaria.limite<=0){
                System.out.println("Erro!");
            }
        }while(contaBancaria.limite<=0);
        
        do{
            System.out.println("Digite o saldo: ");
            contaBancaria.saldo= ler.nextDouble();
            if(contaBancaria.saldo<=0){
                System.out.println("Erro!");
            }
        }while(contaBancaria.saldo<=0);
        
        //Menu 
        byte menu;
            
        do{
            System.out.println("Escolha: "
                          +"\n1. Ver Saldo"
                          +"\n2. Depositar "
                          +"\n3. Sacar"
                          +"\n0. Sair");
            menu= ler.nextByte();
            
            switch (menu){
                case 1:
                    System.out.println("\nVisualizando Saldo...");
                    System.out.println(contaBancaria);
                    break;
                    
                case 2:
                    System.out.println("\nDepositando...");
                    double valorDeposito;
                    do{
                        System.out.println("Digite o valor do depósito: ");
                        valorDeposito= ler.nextDouble();
                        if(valorDeposito<=0){
                        System.out.println("Erro!");
                        }
                    }while(valorDeposito<=0);
                    contaBancaria.depositar(valorDeposito);
                    System.out.println("Depósito efetuado com sucesso!");
                    break;
                    
                case 3:
                    System.out.println("\nSacando...");
                    double valorSaque;
                    do{
                        do{
                            System.out.println("Digite o valor de saque: ");
                            valorSaque = ler.nextDouble();
                            if(valorSaque > contaBancaria.limite){
                            System.out.println("Erro! Valor de saque maior que o limite!");
                            }
                            if(valorSaque> contaBancaria.verSaldo()){
                               System.out.println("Deseja entrar no limite de crédito?"
                                       + "\n1. Sim"
                                       + "\n2. Não");
                            menu = ler.nextByte();
                            }
                            switch(menu){
                                case 1:
                                   System.out.println("Usando o limite de crédito.");
                                   break;
                                   
                                case 2: 
                                   System.out.println("Reidigite o valor do saque.");
                                   valorSaque= ler.nextDouble();
                                   if(valorSaque> contaBancaria.limite){
                                    System.out.println("Erro! Valor de saque maior que o limite!");
                                    }
                                    if(valorSaque<= 0){
                                    System.out.println("Erro! Valor invalido");
                                    }
                            }
                        }while(valorSaque<= 0);
                        }while(valorSaque> contaBancaria.limite);
                        contaBancaria.sacar(valorSaque);
                        System.out.println("Saque efetuado com sucesso!");
                        break;

                case 0:
                System.out.println("Tchau, volte sempre!");
            }
        }while(menu!=0);
    } 
}
