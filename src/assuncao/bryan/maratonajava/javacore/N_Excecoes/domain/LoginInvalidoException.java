package assuncao.bryan.maratonajava.javacore.N_Excecoes.domain;

public class LoginInvalidoException extends  Exception {
    public LoginInvalidoException() {
        super("Login Inválido.");
    }

    public LoginInvalidoException(String message) {
        super(message);
    }
}
