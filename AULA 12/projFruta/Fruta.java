/**
 * @author Thiago Cury
 * @version 1.0
 * @since 01/04/2020 - 09:30
 */
public abstract class Fruta {

    private String cor;    
   
    public String getCor() {
        return this.cor;
    }
    
    public void setCor(String cor) {
        this.cor = cor;
    }
    
    /**
    * @return deve ser implementado nas subclasses.... explicando como comer a fruta
    */
    public abstract String comer();
    
    /**
    * @return deve ser implementado nas subclasses.... explicando como descascar a fruta
    */    
    public abstract String descascar();
}