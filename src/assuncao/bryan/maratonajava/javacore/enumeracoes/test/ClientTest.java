package assuncao.bryan.maratonajava.javacore.enumeracoes.test;

import assuncao.bryan.maratonajava.javacore.enumeracoes.domain.Client;
import assuncao.bryan.maratonajava.javacore.enumeracoes.domain.ClientType;
import assuncao.bryan.maratonajava.javacore.enumeracoes.domain.Payment;

public class ClientTest {
    public static void main(String[] args) {

        Client client1 = new Client("Bryan", ClientType.CPF, Payment.CREDIT);
        Client client2 = new Client("Maju", ClientType.MEI, Payment.DEBIT);

        System.out.println(client1);
        System.out.println(client2);

        System.out.println(client1.getPayment().calcularDesconto(100));
        System.out.println(client2.getPayment().calcularDesconto(100));


    }
}



