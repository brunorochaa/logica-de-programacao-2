package model;
/**
 * Escreva a descrição da classe Posto aqui.
 *
 * @authors (Bruno Rocha, Peterson Peres e Thiago Dias)
 * @version 1.0
 * @since 09/04/2020 - 09:26
 */
public class Posto {
    //Atributos
    private byte codigo;
    private double litros;
    private double calculo;

    //Get&Set
    public byte getCodigo() {
        return codigo;
    }

    public void setCodigo(byte codigo) {
        this.codigo = codigo;
    }

    public double getLitros() {
        return litros;
    }

    public void setLitros(double litros) {
        this.litros = litros;
    }

    public double getCalculo() {
        return calculo;
    }

    public void setCalculo(double calculo) {
        this.calculo = calculo;
    }

    //toString
    @Override
    public String toString() {
        return "Você comprou "+litros+" litros de " +this.tipoDeCombustivel()
                +"\nValor a pagar R$ "+this.calcularValorASerPago();
    }

    //Métodos
    /**
     * @return retorna o valor a ser pago do pedido de gasolina
     */
    public double calcularValorASerPago() {
        if (codigo == 1) {
            calculo = litros * 4.40;
        } else if (codigo == 2) {
            calculo = litros * 3.68;
        }else if (codigo == 3) {
            calculo = litros * 3.71;
        } else if (codigo == 4) {
            calculo =  litros * 0;
        } else {
            calculo = 0;
        }
        return calculo;
    }

    /**
     * @return retorna o nome do tipo de combustível do seu pedido
     */
    public String tipoDeCombustivel() {
        if (codigo == 1) {
            return "Gasolina";
        } else if (codigo == 2) {
            return "Álcool";
        }else if (codigo == 3) {
            return "Diesel";
        } else if (codigo == 4) {
            return "Flex";
        } else {
            return "Inválido";
        }
    }
}
