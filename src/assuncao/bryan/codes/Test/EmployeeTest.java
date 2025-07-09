package assuncao.bryan.codes.Test;

import assuncao.bryan.codes.classes.domain.Employee;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee = new Employee();

        employee.name = "Bryan";
        employee.age = 24;
        employee.salaries = new double[]{1650, 400, 500};
        
        employee.printEmployee();

    }
}


