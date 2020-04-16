import java.util.Arrays;
/**
 * Escreva a descrição da classe Ordem aqui.
 *
 * @author (Bruno Rocha)
 * @version 1.0
 * @since 03/04/2020 - 19:25
 */
public class Ordem implements IOrdem {
    //Atributo
    private int[] valor;
    
    //Construtor
    public Ordem() {
        this.valor= new int[3];
    }
    
    //Get&Set    
    public int[] getValor() {
        return valor;
    }

    public void setValor(int[] valor) {
        this.valor = valor;
    }
    
    //Cadastro
    public void cadastrar(int indice, int valor){
        this.valor[indice]= valor;
    }
    
    //Método
    /**
     * @return retorna os numeros em ordem ordem crescente
     */
    @Override
    public void ordemCrescente(){
        Arrays.sort(this.valor);
    }
    
    /**
     * @return retorna os numeros em ordem ordem decrescente
     */
    @Override
    public void ordemDecrescente(){
        //Arrays.sort(reverse(this.valor);
    }
    
    //toString
    @Override
    public String toString() {
        return "Valor: " +Arrays.toString(valor);
    }
}