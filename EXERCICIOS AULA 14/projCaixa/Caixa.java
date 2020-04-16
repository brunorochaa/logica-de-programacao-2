/**
 * Escreva a descrição da classe Caixa aqui.
 *
 * @author (Bruno Rocha)
 * @version 1.0
 * @since 03/04/2020 - 03:58
 */
public class Caixa implements ICaixa {
    //Atributos
    private int codigo;
    private String produto;
    private int quantidade;
    private double valorASerPago;
    
    //Get&Set
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public String getProduto() {
        return produto;
    }
    
    public void setProduto(String produto) {
        this.produto = produto;
    }
    
    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    public double getValorASerPago() {
        return valorASerPago;
    }

    public void setValorASerPago(double valorASerPago) {
        this.valorASerPago = valorASerPago;
    }
    
    //Métodos
    /**
     * @return retorna o nome do produto
     */
    @Override
    public String produto(){
        switch (codigo) {
            case 1:
                produto = "Sanduíche de Presunto";
                break;
            case 2:
                produto = "Suco de Tamarindo";
                break;
            case 3:
                produto = "Pastel com ovo";
                break;
            case 4:
                produto = "Farroupilha";
                break;
            default:
                produto = "Inválido";
            }
        return produto;
    }
    
    /**
     * @return retorna o valor a ser pago do produto
     */
    @Override
    public double valorASerPago(){
        switch (codigo) {
            case 1:
                valorASerPago = quantidade * 3.65;
                break;
            case 2:
                valorASerPago = quantidade * 2.50;
                break;
            case 3:
                valorASerPago = quantidade * 3.30;
                break;
            case 4:
                valorASerPago = quantidade * 4.70;
                break;
            }
        return valorASerPago;
    }
    
    //toString
    @Override
    public String toString() {
        return "Código do produto: " +this.codigo
              +"\nProduto : " +produto()
              +"\nValor a ser pago: R$ " +valorASerPago();
    }
}