/**
 * @author Thiago Cury
 * @version 1.0
 * @since 01/04/2020 - 10:09
 */
public class Morango extends Fruta {

    
    /**
     * Construtor da classe
     */
    public Morango() {
    }
    
    /**
     * @return retorna a explicacão de como devemos comer a fruta
     */
    public String comer() {
        //adfasdfsadf
        
        /*
           asdfasd
           asdf
           a
           sdfa
           sdf
           af*/
           
           /*
            * asdfasfd
            * asfdasdfads
            */
        return "comer com a mão mesmo.... meio ácido mas doce. huafehufauh";
    }
    
    /**
     * @return retorna a explicacão de como devemos descascar a fruta
     */
    public String descascar() {
        return "tira a folha só e manda ver!";
    }
    
    /**
     * @param valor1 recebe o primeiro valor para calcular valor 1 + valor2
     * @param valor2 recebe o primeiro valor para calcular valor 1 + valor2
     * return retorna a explicacão de como devemos descascar a fruta
     */
    public double calcular(double valor1, double valor2) {
        return valor1 + valor2;
    }
    
    /**
     * @param valor1 recebe o primeiro valor para calcular valor 1 * 2
     */
    public void calcular(double valor1) {
        this.setCor(this.getCor()+valor1);
    }    
    
    public String toString() {
        return "\nCor: " + this.getCor()
             + "\ncomer: " + this.comer()
             + "\ndescascar: " + this.descascar();
    }
    
}