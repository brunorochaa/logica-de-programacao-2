/**
 * Write a description of class Calculadora here.
 *
 * @author Thiago Cury
 * @version 1.0
 * @since 02/04/2020 - 09:21
 */
public class Calculadora {
    
    private double numero1;
    private double numero2;
    
    public Calculadora() {
    }
    
    public double getNumero1() {
        return this.numero1;
    }
    
    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }    
    
    public double getNumero2() {
        return this.numero2;
    }    
    
    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }
    
    /**
     * @return retorna a soma de numero1 por numero2
     */
    public double somar() {
        return this.numero1 + this.numero2;
    }
    
    /**
     * @return retorna a subtração de numero1 por numero2
     */
    public double subtrair() {
        return this.numero1 - this.numero2;
    }
    
    /**
     * @return retorna a multiplicacao de numero1 por numero2
     */
    public double multiplicar() {
        return this.numero1 * this.numero2;
    }
    
    /**
     * @return retorna a divisão de numero1 por numero2
     */
    public double dividir() {
        return this.numero1 / this.numero2;
    }    
    
    public String verificarOpcao(int opcao) {
        /* 1-somar 2-subtrair 3-dividir 4-multiplicar 5-todos */
        switch(opcao) {
            case 1: return "soma: " + somar();
            case 2: return "subtração: " + subtrair();
            case 3: return "divisão: " + dividir();
            case 4: return "multiplicação: " + multiplicar();
            case 5: return toString();
            default: return "vixeeeee! opção inválida...";
        }
    }
    
    public String toString() {
        return "\nNumero 1: " + this.numero1
             + "\nNumero 2: " + this.numero2
             + "\nSoma: " + this.somar()
             + "\nSubtração: " + this.subtrair()
             + "\nDivisão: " + this.dividir()
             + "\nMultiplicação: " + this.multiplicar();
    }
}
