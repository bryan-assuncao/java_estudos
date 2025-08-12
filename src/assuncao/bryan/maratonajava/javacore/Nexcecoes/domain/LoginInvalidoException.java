package assuncao.bryan.maratonajava.javacore.Nexcecoes.domain;

public class LoginInvalidoException extends  Exception {
    public LoginInvalidoException() {
        super("Login Inválido.");
    }

    public LoginInvalidoException(String message) {
        super(message);
    }
}
