
public class ContaCorrente extends Conta {
    
    private double taxa;
    
    public ContaCorrente() {
    }
    
    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }
    
    /**
     * @deprecated asfasdf
     */
    public String gerarExtrato() {
        return "Extrato: " + this.getSaldo();
    }
    
    public void sacar(double valor) {
        //antes
        //this.saldo = this.saldo + valor - taxa;
        //depois....
        this.setSaldo(this.getSaldo() - valor - taxa);
    }
    
    public void depositar(double valor) {
        //antes
        //this.saldo = this.saldo + valor - taxa;
        //depois....
        this.setSaldo(this.getSaldo() + valor - taxa);
    }    
    
    public String toString() {
        return "\nSaldo: " + this.getSaldo();
    }
}