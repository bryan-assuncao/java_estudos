package assuncao.bryan.codes.enumeracoes.test;

import assuncao.bryan.codes.enumeracoes.domain.Employee;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee = new Employee("Bryan", Employee.Senioridade.ESTAGIARIO);

        System.out.println(employee);
    }
}
