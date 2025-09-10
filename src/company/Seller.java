package company;

public class Seller extends User {
    private int quantidadeVendas;

    public Seller(String nome, String email, String senha) {
        super(nome, email, senha, false);
        this.quantidadeVendas = 0;
    }

    public void makeSale() {
        quantidadeVendas++;
        System.out.printf("Venda realizada! Total de vendas: %d%n", quantidadeVendas);
    }

    public void checkSales() {
        System.out.printf("Vendas realizadas: %d", quantidadeVendas);
    }

    public int getSalesCount() {
        return quantidadeVendas;
    }
}
