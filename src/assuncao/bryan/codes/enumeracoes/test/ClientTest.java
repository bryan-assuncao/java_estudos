package assuncao.bryan.codes.enumeracoes.test;

import assuncao.bryan.codes.enumeracoes.domain.Client;
import assuncao.bryan.codes.enumeracoes.domain.ClientType;
import assuncao.bryan.codes.enumeracoes.domain.Days;

public class ClientTest {
    public static void main(String[] args) {
        Days today = Days.Saturday;
        System.out.println("Today is " + today);

        Client client1 = new Client("Bryan", ClientType.CPF, Days.Saturday);
        Client client2 = new Client("Maju", ClientType.MEI, Days.Friday);

        Client client3 = new Client("Bryan", ClientType.CPF, Days.Saturday);
        Client client4 = new Client("Maju", ClientType.MEI, Days.Tuesday);

        Client client5 = new Client("Marias's House", ClientType.CNPJ, Days.Wednesday);

        System.out.println(client1);
        System.out.println(client2);

        System.out.println(client3);
        System.out.println(client4);

        System.out.println(client5);
    }
}

