package assuncao.bryan.codes.testes.enumeracoes.test;

import assuncao.bryan.codes.testes.enumeracoes.domain.Comprador;
import assuncao.bryan.codes.testes.enumeracoes.domain.CpfCnpj;
import assuncao.bryan.codes.testes.enumeracoes.domain.Pagamento;

public class CompradorTest {
    public static void main(String[] args) {
        Comprador comprador = new Comprador("Bryan", Pagamento.DEBITO, CpfCnpj.CPF);
        Comprador comprador2 = new Comprador("Bryan", Pagamento.CREDITO, CpfCnpj.CNPJ);

        System.out.println(comprador);
        System.out.println(comprador2);

        System.out.println(comprador.getPagamento().desconto(100));
        System.out.println(comprador2.getPagamento().desconto(100));
    }
}
