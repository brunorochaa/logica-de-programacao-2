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
        ContaCorrente contaCorrente = new ContaCorrente();
        ContaPoupanca contaPoupanca = new ContaPoupanca();
        /*GeradorExtrato geradorExtrato = new GeradorExtrado();*/
        
        //Menu 
        byte menu;
        do{
            System.out.println("Escolha: "
                          +"\n1. Conta Corrente"
                          +"\n2. Conta Poupança"
                          +"\n0. Sair");
            menu= ler.nextByte();
            
            switch (menu){
                case 1:
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
                                System.out.println(contaCorrente.getSaldo());
                                break;
                                
                            case 2:
                                System.out.println("\nDepositando...");
                                double valor;
                                do{
                                    System.out.println("Digite o valor do depósito: ");
                                    valor= ler.nextDouble();
                                    if(valor<=0){
                                    System.out.println("Erro!");
                                    }
                                }while(valor<=0);
                                contaCorrente.depositar(valor);
                                System.out.println("Depósito efetuado com sucesso!");
                                break;
                                
                            case 3:
                                System.out.println("\nDepositando...");
                                do{
                                    System.out.println("Digite o valor do depósito: ");
                                    valor= ler.nextDouble();
                                    if(valor<=0){
                                    System.out.println("Erro!");
                                    }
                                }while(valor<=0);
                                contaCorrente.sacar(valor);
                                System.out.println("Depósito efetuado com sucesso!");
                                break;
                                
                            case 0:
                                System.out.println("Tchau, volte sempre!");
                        }
                    }while(menu!=0);
                    break;
                    
                    case 2:
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
                                    System.out.println(contaPoupanca.getSaldo());
                                    break;
                                    
                                case 2:
                                    System.out.println("\nDepositando...");
                                    double valor;
                                    do{
                                        System.out.println("Digite o valor do depósito: ");
                                        valor= ler.nextDouble();
                                        if(valor<=0){
                                        System.out.println("Erro!");
                                        }
                                    }while(valor<=0);
                                    contaPoupanca.depositar(valor);
                                    System.out.println("Depósito efetuado com sucesso!");
                                    break;
                                    
                                case 3:
                                    System.out.println("\nDepositando...");
                                    do{
                                        System.out.println("Digite o valor do depósito: ");
                                        valor= ler.nextDouble();
                                        if(valor<=0){
                                        System.out.println("Erro!");
                                        }
                                    }while(valor<=0);
                                    contaPoupanca.sacar(valor);
                                    System.out.println("Depósito efetuado com sucesso!");
                                    break;
                                    
                                case 0:
                                    System.out.println("Tchau, volte sempre!");
                            }
                    }while(menu!=0);
                    break;
                            
                    case 0:
                        System.out.println("Tchau, volte sempre!");
                    }
            }while(menu!=0);
        } 
}