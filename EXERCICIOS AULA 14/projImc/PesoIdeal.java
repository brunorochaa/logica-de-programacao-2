/**
 * Escreva a descrição da classe PesoIdeal aqui.
 *
 * @author (Bruno Rocha)
 * @version 1.0
 * @since 03/04/2020 - 06:10
 */
public class PesoIdeal implements IPesoIdeal {
    //Atributos
    private int codigo;
    private String nome;
    private double altura;
    private double peso;
    
    //Get&Set
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
     public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    //Métodos
    /**
     * @return retorna o sexo da pessoa
     */
    @Override
    public String sexo() {
        String sexo;
        switch (codigo) {
            case 1:
                sexo = "homem";
                break;
            case 2:
                sexo = "mulher";
                break;
            default:
                sexo = "Inválido";
            }
        return sexo;
    }
    
    /**
     * @return retorna o peso ideal da pessoa
     */
    @Override
    public double calculoPesoIdeal() {
        double calculoPesoIdeal;
        switch (codigo) {
            case 1:
                calculoPesoIdeal = (72.7 * altura) - 58;
                break;
            case 2:
                calculoPesoIdeal = (62.1 * altura) - 44.7;
                break;
            default:
                calculoPesoIdeal = 0;
                break;
            }   
        return calculoPesoIdeal;
    }
    
    /**
     * @return retorna o calculo do imc da pessoa
     */
    @Override
    public double calculoImc() {
        double calculoImc;
        switch (codigo) {
            case 1:
                calculoImc = peso / (altura * altura);
                break;
            case 2:
                calculoImc = peso / (altura * altura);
                break;
            default:
                calculoImc = 0;
                break;
            }   
        return calculoImc;
    }
    
    /**
     * @return retorna o imc da pessoa
     */
    @Override
    public String imc() {
        if(calculoImc()<=18.5){
            return "Abaixo do peso";
        }else if(calculoImc()>=18.5 && calculoImc()<=24.9){
            return "Saudável";
        }else if(calculoImc()>=25.0 && calculoImc()<=29.9){
            return "Peso em excesso";
        }else if(calculoImc()>=30.0 && calculoImc()<=34.9){
            return "Obesidade Grau I";
        }else if(calculoImc()>=34.9 && calculoImc()<=39.9){
            return "Obesidade Grau II";
        }else{
            return "Obesidade Grau III"; 
        }
    }
    
    //toString
    @Override
    public String toString() {
        return "" +this.nome+ " é " +sexo()+ " pesa " +this.peso+ " kgs e tem " +this.altura+ " de altura"+
               "\nSeu peso ideal é: "+calculoPesoIdeal()+
               "\nSeu imc é: " +calculoImc()+ ", " +imc();
    }
}