package assuncao.bryan.maratonajava.javacore.Jenumeracoes.test;

import assuncao.bryan.maratonajava.javacore.Jenumeracoes.domain.Client;
import assuncao.bryan.maratonajava.javacore.Jenumeracoes.domain.ClientType;
import assuncao.bryan.maratonajava.javacore.Jenumeracoes.domain.Payment;

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



