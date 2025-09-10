package company;

public abstract class User implements IUser {
    private String nome;
    private String email;
    private String senha;
    private final boolean isManager;

    public User(String nome, String email, String senha, boolean isManager) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.isManager = isManager;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    @Override
    public void login() {
        System.out.printf("Bem vindo, %s. Você realizou login com o email %s%n", nome, email);
    }

    @Override
    public void logoff() {
        System.out.println("Usuário deslogado.");
    }

    @Override
    public void changeData(String novoNome, String novoEmail) {
        this.nome = novoNome;
        this.email = novoEmail;
        System.out.printf("Dados atualizados para: %s - %s%n", novoNome, novoEmail);
    }

    @Override
    public void changePassword(String newPassword) {
        this.senha = newPassword;
        System.out.println("Senha alterada com sucesso!");
    }

}
