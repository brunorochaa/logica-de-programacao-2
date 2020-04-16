public class Aluno {
    //Atributos
    public String nome;
    public float nota1;
    public float nota2;
    
    //toString
    @Override
    public String toString() {
        return "\nNome do Aluno: " +nome+
               "\nN1: " +nota1+
               "\nN2: " +nota2;
    }

    //Métodos
    public String mostrarNome () {
        return this.nome;
    }
    
    public float mostrarNota1 () {
        return this.nota1;
    }
    
    public float mostrarNota2 () {
        return this.nota2;
    }
    
    public float calcularMedia () {
        return (this.nota1+this.nota2)/2;
    }
    
    public String resposta () {
        if(this.calcularMedia()>=6){
            return "Aprovado";
        }else{
            return "Reprovado";
        }
    }
}