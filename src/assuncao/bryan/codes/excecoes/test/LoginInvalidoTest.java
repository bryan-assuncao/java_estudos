package assuncao.bryan.codes.excecoes.test;

import assuncao.bryan.codes.excecoes.domain.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoTest {
    public static void main(String[] args) throws LoginInvalidoException {
        logar();
    }

    private static void logar() throws LoginInvalidoException {
        Scanner scanner = new Scanner(System.in);

        String userNameDB = "Goku".toLowerCase();
        String senhaDB = "SSJ";

        System.out.print("Usuário: ");
        String useNameDigitado = scanner.nextLine().toLowerCase();

        System.out.print("Senha: ");
        String senhaDigitada = scanner.nextLine();

        if (!useNameDigitado.equals(userNameDB) || !senhaDigitada.equals(senhaDB)){
            throw new LoginInvalidoException("Usuário ou senha inválido.");
        }

        System.out.println("Usuário logado com sucesso.");

        scanner.close();
    }
}
