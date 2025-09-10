package company;

public class Attendant extends User {
    private double cashRegister;

    public Attendant(String nome, String email, String senha) {
        super(nome, email, senha, false);
        this.cashRegister = 0.0;
    }

    public void receivePayment(double amount) {
        cashRegister += amount;
        System.out.printf("Pagamento recebido: R$ %.2f | Total na registradora: R$ %.2f%n", amount, cashRegister);
    }

    public void closeRegister() {
        System.out.printf("Registradora fechada com o total de R$ %.2f%n", cashRegister);
        cashRegister = 0.0;
    }

    public double getCashRegister() {
        return cashRegister;
    }
}
