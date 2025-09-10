package company;

public class Manager extends User {
    public Manager(String nome, String email, String senha) {
        super(nome, email, senha, true);
    }

    public void generateFinancialReport(){
        System.out.println("Relatório financeiro gerado");
    }

    public void checkSales(){
        System.out.println("Consultando todas vendas ...");
    }
}
