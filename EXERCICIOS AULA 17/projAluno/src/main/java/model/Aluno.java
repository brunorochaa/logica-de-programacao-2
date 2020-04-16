import java.util.Arrays;
/**
 * Escreva a descrição da classe Aluno aqui.
 *
 * @authors (Bruno Rocha, Peterson Peres e Thiago Dias)
 * @version 1.0
 * @since 08/04/2020 - 10:10
 */
public class Aluno {
    //Atributos
    private String nome;
    private double[] nota;

    //Método Construtor
    public Aluno(){
        this.nota = new double[3];
    }

    //Get&Set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double[] getNota() {
        return nota;
    }

    public void setNota(double[] nota) {
        this.nota = nota;
    }

    //toString
    @Override
    public String toString() {
        return "Notas: " +Arrays.toString(nota)
                +"\n" +getNome()+ " teve Média: "+calcularMedia()+ " e " +"Conceito: "+conceito();
    }

    //Cadastro
    public void cadastrar(int indice, double nota){
        this.nota[indice]= nota;
    }

    //Métodos
    /**
     * @return retorna a média aritmética do aluno
     */
    public double calcularMedia() {
        return (this.nota[0] + this.nota[1] + this.nota[2]) / 3;
    }

    /**
     * @return retorna o conceito da média do aluno
     */
    public String conceito(){
        if(calcularMedia()>=9){
            return "A";
        }else if(calcularMedia()>6.9 && calcularMedia()<8.9){
            return "B";
        }else if(calcularMedia()>4.9 && calcularMedia()<6.9){
            return "C";
        }else if(calcularMedia()<4.9){
            return "D";
        }else{
            return "Inválido";
        }
    }
}