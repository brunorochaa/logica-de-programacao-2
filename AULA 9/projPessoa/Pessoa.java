public class Pessoa {
    public String nome;
    public String sobrenome;
    public String email;
    public String dataDeNascimento;
    
    //Construtor
    public Pessoa(){
        this.nome = "";
        this.sobrenome = "";
        this.email = "";
        this.dataDeNascimento = "00/00/0000";
    }
    
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
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getDataDeNascimento() {
        return dataDeNascimento;
    }
    
    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }
    
    //toString
    @Override
    public String toString() {
        return "\n####### Classe Pessoa #######"+
               "\nNome: " +nome+ "" +sobrenome+
               "\nEmail: " +email+
               "\nDataDeNascimento: " +dataDeNascimento;
    }
}