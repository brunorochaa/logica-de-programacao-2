public class Aluno extends Pessoa {
    public float nota1;
    public float nota2;
    
    //Construtor
    public Aluno() {
        super();
    }
    
    //Get&Set
    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }
    
    public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }
    
    //toString
    @Override
    public String toString() {
        return "####### Classe Aluno #######"+
               "\nNome: " +getNome()+ " " +getSobrenome()+
               "\nEmail: " +getEmail()+
               "\nData de Nascimento: " +getDataDeNascimento()+
               "\nNota 1: " +nota1+
               "\nNota 2: " +nota2+
               "\nMédia Aritmética: " +calcularMedia();
    }
    
    //Métodos
    public float calcularMedia () {
        return (this.nota1+this.nota2)/2;
    }
}