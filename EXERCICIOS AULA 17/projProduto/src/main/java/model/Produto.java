package model;
/**
 * Escreva a descrição da classe Produto aqui.
 *
 * @authors (Bruno Rocha, Peterson Peres e Thiago Dias)
 * @version 1.0
 * @since 08/04/2020 - 17:42
 */
public class Produto {
    private String nome;
    private int quantidade;
    private double valor;

    //Construtor
    public Produto() {
    }

    /**
     * param nome
     * param quantidade
     * param valor
     */
    //Get&Set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    //toString
    @Override
    public String toString() {
        return "Nome: " +nome
                +"\nQuantidade: " +quantidade
                +"\nValor: " +valor;
    }
}
