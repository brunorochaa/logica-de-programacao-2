public class Calculadora {
    //Atributos
    public double valor1;
    public double valor2;
    
    //toString
    @Override
    public String toString() {
        return "\nN1: " +valor1+
               "\nN2: " +valor1;
    }

    //Métodos
    public double mostrarValor1 () {
        return this.valor1;
    }
    
    public double mostrarValor2 () {
        return this.valor2;
    }
    
    public double somarValores () {
        return this.valor1+this.valor2;
    }
    
    public double subtrairValores () {
        return this.valor1-this.valor2;
    }
    
    public double multiplicarValores () {
        return this.valor1*this.valor2;
    }
    
    public double dividirValores () {
        return this.valor1/this.valor2;
    }
}