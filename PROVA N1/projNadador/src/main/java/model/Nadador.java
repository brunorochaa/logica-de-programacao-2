package model;
/**
 * Escreva a descrição da classe Nadador aqui.
 *
 * @authors (Bruno Rocha, Peterson Peres e Thiago Dias)
 * @version 1.0
 * @since 09/04/2020 - 10:41
 */
public class Nadador {
    //Atributos
    private String nome;
    private byte idade;

    //Get&Set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public byte getIdade() {
        return idade;
    }

    public void setIdade(byte idade) {
        this.idade = idade;
    }

    //toString
    @Override
    public String toString() {
        return "O nadador:"
                +"\nNome: "+nome+" Idade: "+idade
                +"\nCompete na categoria: "+this.verificarCategoria();
    }

    //Método
    public String verificarCategoria() {
        if (this.idade<8) {
            return "Não pode competir ainda! Idade mínima é de 8 anos.";
        } else if (this.idade>=8 && this.idade<=10) {
            return "Infantil";
        } else if (this.idade>=11 && this.idade<=17) {
            return "Juvenil";
        } else if (this.idade>=18) {
            return "Adulto";
        } else {
            return "Inválido";
        }
    }
}