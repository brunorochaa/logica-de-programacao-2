public class ContaPoupanca implements ContaInterface {
    //Atributos
    private double saldo;
    
    //Construtor
    public ContaPoupanca() {
        this.saldo = 0.0;
    }
    
    //Get&Set
    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
    
    //Métodos
    @Override
    public void depositar(double valor) {
        this.saldo+= valor;
    }
    
    @Override
    public void sacar(double valor) {
        this.saldo-= valor;
    }
    
    @Override
    public double getSaldo() {
        return this.saldo;
    }
    
    //toString
    @Override
    public String toString() {
        return "####### Extrato #######"+
               "\nSaldo: " +getSaldo();
    }
}