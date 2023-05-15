import java.util.ArrayList;

public class Comanda {
    private int codigo;
    private double valorTotal;
    private ArrayList<ArrayList> produtos = new ArrayList<>();

    public Comanda(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }
    public void calcularValorTotal(){
        for (int i = 0; i < produtos.size(); i++){
            this.valorTotal += Double.parseDouble(produtos.get(i).get(1).toString());
        }
    }

    public void registrarProduto(ArrayList produto){
        produtos.add(produto);
    }

    @Override
    public String toString() {
        return "Comanda -> " +
                "codigo do pedido = " + codigo +
                ", valor total do pedido = " + valorTotal +
                ", Produtos = " + produtos;
    }
}
