/**
 * Escreva a descrição da classe Mes aqui.
 *
 * @author (Bruno Rocha)
 * @version 1.0
 * @since 03/04/2020 - 01:44
 */
public class Mes implements IMes {
    //Atributo
    private byte mes;
    
    //Get&Set
    public byte getMes() {
        return mes;
    }

    public void setMes(byte mes) {
        this.mes = mes;
    }
    
    //Método
    /**
     * @return retorna o nome do mes
     */
    @Override
    public String resposta(){
        String resposta;
        switch (mes) {
            case 1:
                resposta = "Janeiro";
                break;
            case 2:
                resposta = "Fevereiro";
                break;
            case 3:
                resposta = "Março";
                break;
            case 4:
                resposta = "Abril";
                break;
            case 5:
                resposta = "Maio";
                break;
            case 6:
                resposta = "Junho";
                break;
            case 7:
                resposta = "Julho";
                break;
            case 8:
                resposta = "Agosto";
                break;
            case 9:
                resposta = "Setembro";
                break;
            case 10:
                resposta = "Outubro";
                break;
            case 11:
                resposta = "Novembro";
                break;
            case 12:
                resposta = "Dezembro";
                break;
            default:
                resposta = "Inválido";
                break;
        }
        return resposta;
    }
    
    //toString
    @Override
    public String toString() {
        return "Mês: " +this.mes+ ", " +this.resposta();
    }
}