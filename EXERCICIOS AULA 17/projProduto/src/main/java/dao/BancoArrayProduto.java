package dao;
import model.Produto;
import java.util.ArrayList;
import java.util.List;

public class BancoArrayProduto {
    private List<Produto> produto;

    public BancoArrayProduto() {
        this.produto = new ArrayList<>();
    }

    public void cadastrar(Produto produto) {
        this.produto.add(produto);
    }

    public List<Produto> buscar(){
        return this.produto;
    }

    public void excluir(int index) {
        this.produto.remove(index);
    }

    public void alterar(int index, Produto produto) {
        this.produto.add(index, produto);
    }

    public Produto filtrar(Produto produto, int filtro) {
        switch(filtro) {
            case 1:
                for(Produto produtoAuxiliar : this.produto) {
                    if(produtoAuxiliar.getNome().contains(produtoAuxiliar.getNome()))
                        return produtoAuxiliar;
                }
                break;

            /*case 2:
                for(Produto produtoAuxiliar : this.produto) {
                    if(produtoAuxiliar.getNome().contains(produtoAuxiliar.getQuantidade()))
                        return produtoAuxiliar;
                }
                break;

            case 3:
                for(Produto produtoAuxiliar : this.produto) {
                    if(produtoAuxiliar.getNome().contains(produtoAuxiliar.getValor()))
                        return produtoAuxiliar;
                }
                break;*/
        }
        return null;
    }

    public int verificarQuantidadeDeProdutos() {
        return this.produto.size();
    }

    public void apagarProduto() {
        this.produto.clear();
    }
}