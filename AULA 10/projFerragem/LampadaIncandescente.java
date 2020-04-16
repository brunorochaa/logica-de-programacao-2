public class LampadaIncandescente implements LampadaInterface {
    public String marca;
    public String state;
    
    //Get&Set
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public void setState(String state) {
        this.state = state;
    }
    
    //Métodos
    @Override
    public String getMarca() {
        return marca;
    }
    
    @Override
    public void on() {
        state = "Ligada!";
    }
    
    @Override
    public void off() {
        state = "Desligada.";
    }
    
    @Override
    public String getState() {
        return state;
    }
    
    //toString
    @Override
    public String toString() {
        return "####### Classe Lampada Incandescente #######"+
               "\nMarca: " +getMarca()+
               "\nState: " +getState();
    }
}