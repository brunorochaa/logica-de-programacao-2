public class Professor extends Pessoa {
    public int numeroDeRegistro;
    public double numeroDeHorasTrabalhadas;
    public double valorHora;
    
    //Construtor
    public Professor() {
        super();
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
    
    public int getNumeroDeRegistro() {
        return numeroDeRegistro;
    }

    public void setNumeroDeRegistro(int numeroDeRegistro) {
        this.numeroDeRegistro = numeroDeRegistro;
    }
    
    public double getNumeroDeHorasTrabalhadas() {
        return numeroDeHorasTrabalhadas;
    }

    public void setNumeroDeHorasTrabalhadas(double numeroDeHorasTrabalhadas) {
        this.numeroDeHorasTrabalhadas = numeroDeHorasTrabalhadas;
    }
    
    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
    
    //toString
    @Override
    public String toString() {
        return "\n####### Classe Professor #######"+
               "\nNúmero de Registro: " +numeroDeRegistro+
               "\nNome: " +getNome()+ " " +getSobrenome()+
               "\nEmail: " +getEmail()+
               "\nData de Nascimento: " +getDataDeNascimento()+
               "\nNúmero de Horas Trabalhadas: " +numeroDeHorasTrabalhadas+
               "\nValor Hora: " +valorHora+
               "\nSalário Bruto: " +calcularSalarioBruto()+
               "\nFGTS: " +calcularFGTS();
    }
    
    //Métodos
    public double calcularSalarioBruto () {
        return this.numeroDeHorasTrabalhadas * valorHora;
    }
    
    public double calcularFGTS () {
        return this.calcularSalarioBruto() * 0.08;
    }
}