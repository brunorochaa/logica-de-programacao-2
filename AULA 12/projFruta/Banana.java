/**
 * @author Thiago Cury
 * @version 1.0
 * @since 01/04/2020 - 09:30
 */
public class Banana extends Fruta {

    /**
     * Construtor da classe
     */
    public Banana() {
    }
    
    /**
     * @return retorna a explicacão de como devemos comer a fruta
     */
    public String comer() {
            return "comer com a mão mesmo.... doce.";
    }
    
    /**
     * @return retorna a explicacão de como devemos descascar a fruta
     */    
    public String descascar() {
        return "tira a casca com a mão mesmo... 4 lados.... e manda ver!";
    }
    
    public String toString() {
        return "\nCor: " + this.getCor()
             + "\ncomer: " + this.comer()
             + "\ndescascar: " + this.descascar();
    }
    
}