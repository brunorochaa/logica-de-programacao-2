package model;
/**
 * Escreva a descrição da classe Trimestre aqui.
 *
 * @authors (Bruno Rocha, Peterson Peres e Thiago Dias)
 * @version 1.0
 * @since 09/04/2020 - 08:22
 */
public class Trimestre {
    //Atributo
    private String mes;

    //Get&Set
    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    //toString
    @Override
    public String toString() {
        return "Mês: "+mes
                +"\nTrimestre: " +this.verificarTrimestre();
    }

    //Método
    /**
     * @return retorna o trimestre em que a pessoa nasceu
     */
    public String verificarTrimestre() {
        if (this.mes.equalsIgnoreCase("Janeiro") || this.mes.equalsIgnoreCase("Fevereiro")
                || this.mes.equalsIgnoreCase("Março")) {
            return "1º Trimestre";
        } else if (this.mes.equalsIgnoreCase(" Abril") || (this.mes.equalsIgnoreCase("Maio"))
                || (this.mes.equalsIgnoreCase("Junho"))) {
            return "2º Trimestre";
        } else if (this.mes.equalsIgnoreCase("Julho") || this.mes.equalsIgnoreCase("Agosto")
                || this.mes.equalsIgnoreCase("Setembro")) {
            return "3º Trimestre";
        } else if (this.mes.equalsIgnoreCase("Outubro") || this.mes.equalsIgnoreCase("Novembro")
                || this.mes.equalsIgnoreCase("Dezembro")) {
            return "4º Trimestre";
        } else {
            return "Inválido!";
        }
    }
}
