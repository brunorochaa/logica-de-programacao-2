/**
 * Escreva a descrição da classe Aluno aqui.
 *
 * @author (Bruno Rocha)
 * @version 1.0
 * @since 03/04/2020 - 04:40
 */
public class Aluno implements IAluno {
    //Atributo
    private String nome;
    private String sobrenome;
    private double nota1;
    private double nota2;
    
    //Get&Set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    
    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }
    
    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }
    
    //Métodos
    /**
     * @return retorna a média aritmética do aluno
     */
    @Override
    public double calcularMedia() {
        return (this.nota1 + this.nota2) / 2;
    }
    
    /**
     * @return retorna o conceito da média do aluno
     */
    @Override
    public String conceito(){
        if(calcularMedia()>9 && calcularMedia()==10){
            return "A";
        }else if(calcularMedia()>7.9 && calcularMedia()<8.9){
            return "B";
        }else if(calcularMedia()>5.9 && calcularMedia()<7.9){
            return "C";
        }else if(calcularMedia()<5.9){
            return "D";
        }else{
            return "Inválido";
        }
    }
    
    /**
     * @return retorna a a situação final da nota do aluno
     */
    @Override
    public String situacao(){
        if(calcularMedia()>5.9){
            return "Aprovado";
        }else{
            return "Reprovado";
        }
    }
    
    //toString
    @Override
    public String toString() {
        return "Aluno: " +this.nome+ " "+this.sobrenome
              +"\nN1 : " +this.nota1+ ", N2: " +this.nota2+ ", Média: "+calcularMedia()
              +"\nConceito: " +conceito()+ ", Situação: " +situacao();
    }
}