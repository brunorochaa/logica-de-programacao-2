/**
 * Abstract class FiguraGeometrica - write a description of the class here
 *
 * @author Thiago Cury
 * @version 1.0
 * @since 02/04/2020 - 09:07
 */
public class Quadrado extends FormaGeometrica {

    private double lado;
    
    public double getLado() {
        return this.lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    
    /**
     * @return retorna a área do quadrado lado * lado
     */
    @Override
    public double calcularArea() {
        return Math.pow(this.lado, 2); //Math.pow(base, expoente)
        //return this.lado * this.lado;
    }
    
    /**
     * @return retorna o perimetro do quadrado lado * 4
     */
    @Override    
    public double calcularPerimetro() {
        return 4 * this.lado;
    }   
    
    public String toString() {
        return "\nLado: " + this.lado 
             + "\nÁrea: " + this.calcularArea()
             + "\nPerímetro: " + this.calcularPerimetro();
    }
    
}