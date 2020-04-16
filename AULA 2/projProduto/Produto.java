public class Produto {
    //Atributos
    public String descricao;
    public float valor;
    public int quantidade;
    
    //Métodos
    public float calcularEstoque () {
        return this.quantidade*this.valor;
    }
}