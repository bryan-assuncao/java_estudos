package assuncao.bryan.codes.Test;

import assuncao.bryan.codes.classes.domain.Employee;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee = new Employee();

        employee.setName("Bryan");
        employee.setAge(24);
        employee.setSalaries(new double[]{1650, 400, 500});


        employee.printEmployee();

    }
}


