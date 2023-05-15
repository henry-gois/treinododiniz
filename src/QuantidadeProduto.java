import java.util.ArrayList;

public class QuantidadeProduto {
    private int quantidade;
    private Produto produto;
    private ArrayList<String> produtoLista = new ArrayList<>();

    public QuantidadeProduto(int quantidade, Produto produto) {
        this.quantidade = quantidade;
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public void aumentarQuantidade(int quantidade){
        this.quantidade = this.quantidade + quantidade;
    }

    public double calcularValor(){
        return this.produto.getValor() * this.quantidade;
    }

    public ArrayList<String> enviarProduto() {
        produtoLista.add(produto.getNome());
        produtoLista.add(String.valueOf(calcularValor()));
        return produtoLista;
    }
}
