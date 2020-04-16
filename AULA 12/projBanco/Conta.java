public abstract class Conta {

    private String titular;
    private int numero;
    private int agencia;
    private double saldo;
    
    public String getTitular() {
        return this.titular;
    }
    
    public void setTitular(String titular) {
        this.titular = titular;
    }
    
    public int getNumero() {
        return this.numero;
    }
    
    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public int getAgencia() {
        return this.agencia;
    }
    
    public void setAgencia(int agencia) {
        if(agencia < 0) {
            this.agencia = 0000;
        } else {
            this.agencia = agencia;
        }
    }    
    
    public double getSaldo() {
        return this.saldo;
    }
    
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public abstract void sacar(double valor);
    public abstract void depositar(double valor);
}