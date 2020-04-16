public class ContaCorrente implements ContaInterface {
    //Atributos
    private double saldo;
    private double taxaDeOperacao;
    
    //Construtor
    public ContaCorrente() {
        this.saldo = 0.0;
        this.taxaDeOperacao = 0.45;
    }
    
    //Get&Set
    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
    
    public double getTaxaDeOperacao() {
        return this.taxaDeOperacao;
    }
    
    public void setTaxaDeOperacao(Double taxaDeOperacao) {
        this.taxaDeOperacao = taxaDeOperacao;
    }
    
    //Métodos
    @Override
    public void depositar(double valor) {
        this.saldo+= valor - this.taxaDeOperacao;
    }
    
    @Override
    public void sacar(double valor) {
        this.saldo-= valor - this.taxaDeOperacao;
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