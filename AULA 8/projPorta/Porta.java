public class Porta {
    public String cor;
    public boolean status;
    public float dimensaoX, dimensaoY, dimensaoZ;
    
    //toString
    @Override
    public String toString() {
        return "\nCor da Porta: " +cor+
               "\nStatus da Porta: " +statusDaPorta()+
               "\nDimensões da Porta: x= " +dimensaoX+ ", y= " +dimensaoY+ ", Z= " +dimensaoZ+ ".";        
    }

    //Métodos
    public void pintar(String cor) {
        this.cor= cor;
    }
    
    public void abre() {
        if (this.status==false){
            this.status= true;
        }
    }
    
    public void fecha() {
        if (this.status==true){
            this.status= false;
        }
    }
    
    public String statusDaPorta() {
        if (this.status==true) {
            return "A porta está aberta, entre!";
        } else {
            return "A porta está fechada, volte mais tarde!";
        }
    }
}
