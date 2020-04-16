public class ContaBancaria {
    //Atributos
    public double limite;
    public double saldo;
    
    //toString
    @Override
    public String toString() {
        return "\nLimite: " +limite+
               "\nSaldo: " +saldo;
    }

    //Métodos
    public double verSaldo(){
        return this.saldo;
    }
    
    public void sacar(double valor){
        this.saldo-= valor;
    }
    
    public void depositar(double valor){
        this.saldo+= valor;
    }
   
}