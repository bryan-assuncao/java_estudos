package assuncao.bryan.codes.classes.domain;

public class Employee {
    public String name;
    public int age;
    public double[] salaries;


    public void printEmployee(){

        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);

        if (salaries == null) return;

        for(double salary : salaries){
        System.out.println("Salary: " + salary);
        }

        totalAndAverangeSalary();

    }

    public void totalAndAverangeSalary(){
        
        if (salaries == null) return;

        double total = 0;

        for(double salary : salaries){
        total += salary;
        }

        System.out.println("Total: " + total);
        double averange = total / salaries.length;
        System.out.println("Averange: " + averange);
        
    }
}



