package company;

public interface IUser {

    void login();
    void logoff();
    void changeData(String novoEmail, String novoNome);
    void changePassword(String newPassword);
}
