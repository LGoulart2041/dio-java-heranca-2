import company.Attendant;
import company.IUser;
import company.Manager;
import company.Seller;

public class Main {
    public static void main(String[] args) {
        // Criação dos usuários
        IUser manager = new Manager("Anna", "anna@company.com", "1234");
        IUser seller = new Seller("Charles", "charles@company.com", "abcd");
        IUser attendant = new Attendant("Mary", "mary@company.com", "xyz");

        // Array de usuários para demonstrar polimorfismo
        IUser[] users = { manager, seller, attendant };

        // Todos fazem login
        for (IUser user : users) {
            user.login();
        }

        System.out.println();

        // Operações específicas de cada tipo de usuário
        System.out.println("### Operações de Gerente ###");
        Manager m = (Manager) manager;
        m.generateFinancialReport();
        m.checkSales();
        m.changeData("Anna Silva", "anna.silva@company.com");
        m.changePassword("new1234");

        System.out.println("\n### Operações de Vendedor ###");
        Seller s = (Seller) seller;
        s.makeSale();
        s.makeSale();
        s.checkSales();
        s.changeData("Charles Brown", "charles.brown@company.com");
        s.changePassword("newabcd");

        System.out.println("\n### Operações de Atendente ###");
        Attendant a = (Attendant) attendant;
        a.receivePayment(200.0);
        a.receivePayment(150.0);
        System.out.println("Valor em caixa antes de fechar: $" + a.getCashRegister());
        a.closeRegister();
        a.changeData("Mary Johnson", "mary.johnson@company.com");
        a.changePassword("newxyz");

        System.out.println();

        // Todos fazem logoff
        for (IUser user : users) {
            user.logoff();
        }
    }
}
