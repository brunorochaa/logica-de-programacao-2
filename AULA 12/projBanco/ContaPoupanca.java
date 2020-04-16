public class ContaPoupanca extends Conta {
        
    public ContaPoupanca() {
    }
   
    public String gerarExtrato() {
        return "Extrato: " + this.getSaldo();
    }
    
    public void sacar(double valor) {
        //antes
        //this.saldo = this.saldo + valo;
        //depois....
        this.setSaldo(this.getSaldo() - valor);
    }
    
    public void depositar(double valor) {
        //antes
        //this.saldo = this.saldo + valor;
        //depois....
        this.setSaldo(this.getSaldo() + valor);
    }    
    
    public double calcularJuros() {
        return this.getSaldo() * 0.04;
    }
    
    public String toString() {
        return "\nSaldo: " + (this.getSaldo() + this.calcularJuros());
    }
}