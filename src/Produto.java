public class Produto {
    private int codigo;
    private String nome;
    private double valor;

    private int estoque;

    public Produto(int codigo, String nome, double valor, int estoque) {
        this.codigo = codigo;
        this.nome = nome;
        this.valor = valor;
        this.estoque = estoque;
    }
    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public void atualizarEstoque(int quantidade){
        this.estoque = this.estoque - quantidade;
    }

    public void atualizarValor(double valor){
        this.valor = this.valor - valor;
    }
}
