package assuncao.bryan.maratonajava.javacore.J_Enumeracoes.test;

import assuncao.bryan.maratonajava.javacore.J_Enumeracoes.domain.Employee;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee = new Employee("Bryan", Employee.Senioridade.ESTAGIARIO);

        System.out.println(employee);
    }
}
