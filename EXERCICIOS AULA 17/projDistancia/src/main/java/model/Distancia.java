import java.util.Arrays;
/**
 * Escreva a descrição da classe Aluno aqui.
 *
 * @authors (Bruno Rocha, Peterson Peres e Thiago Dias)
 * @version 1.0
 * @since 08/04/2020 - 11:31
 */
public class Distancia {
    private double x1;
    private double x2;
    private double y1;
    private double y2;

    //Get&Set
    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public double getY1() {
        return y1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public double getY2() {
        return y2;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }

    //toString
    @Override
    public String toString() {
        return "Distancia: " +verificarDistancia()
                +"\nA: ("+this.x1+";"+this.y1+")"
                +"\nB: ("+this.x2+";"+this.y2+")";
    }

    //Métodos
    /*return verifica a distância entre os 4 pontos*/
    public double verificarDistancia() {
        return Math.sqrt((this.x2 - this.x1) * 2 + (this.y2 - this.y1) * 2);
    }
}
