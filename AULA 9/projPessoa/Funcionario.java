public class Funcionario extends Pessoa {
    public int numeroDeRegistro;
    public double salarioFixo;
    
    //Construtor
    public Funcionario() {
        super();
    }
    
    //Get&Set
    public int getNumeroDeRegistro() {
        return numeroDeRegistro;
    }

    public void setNumeroDeRegistro(int numeroDeRegistro) {
        this.numeroDeRegistro = numeroDeRegistro;
    }
    
    public double getSalarioFixo() {
        return salarioFixo;
    }

    public void setSalarioFixo(double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }
    
    //toString
    @Override
    public String toString() {
        return "\n####### Classe Funcionário #######"+
               "\nNúmero de Registro: " +numeroDeRegistro+
               "\nNome: " +getNome()+ " " +getSobrenome()+
               "\nEmail: " +getEmail()+
               "\nData de Nascimento: " +getDataDeNascimento()+
               "\nSalário Fixo: " +salarioFixo+
               "\nFGTS: " +calcularFGTS();
    }
    
    //Métodos
    public double calcularFGTS () {
        return this.salarioFixo * 0.08;
    }
}