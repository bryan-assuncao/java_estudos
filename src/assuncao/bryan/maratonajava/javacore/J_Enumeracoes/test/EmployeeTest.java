package assuncao.bryan.maratonajava.javacore.Jenumeracoes.test;

import assuncao.bryan.maratonajava.javacore.Jenumeracoes.domain.Employee;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee = new Employee("Bryan", Employee.Senioridade.ESTAGIARIO);

        System.out.println(employee);
    }
}
