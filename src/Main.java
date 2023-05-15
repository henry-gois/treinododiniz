import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Comanda comanda1 = new Comanda(1);
        Scanner scanner = new Scanner(System.in);
        String continuar;
        Produto produto;
        QuantidadeProduto quantidadeProduto;
        do {
            System.out.println("1 - Adicionar produto\n2 - Mostrar comanda\n3 - Sair do sistema");
            continuar = scanner.nextLine();
            if(continuar.equals("1")) {
                System.out.println("Qual o código do produto? ");
                int cod = Integer.parseInt(scanner.nextLine());
                System.out.println("Qual o nome do produto? ");
                String nome = scanner.nextLine();
                System.out.println("Qual o valor do produto? ");
                double valor = Double.parseDouble(scanner.nextLine());
                System.out.println("Qual o estoque do produto? ");
                int estoque = Integer.parseInt(scanner.nextLine());
                System.out.println("Qual a quantidade do produto? ");
                int qtd = Integer.parseInt(scanner.nextLine());
                produto = new Produto(cod, nome, valor, estoque);
                quantidadeProduto = new QuantidadeProduto(qtd, produto);
                comanda1.registrarProduto(quantidadeProduto.enviarProduto());
            } else if(continuar.equals("2")) {
                System.out.println(comanda1.toString());
            }
        } while (!continuar.equals("3"));
    }
}