    package assuncao.bryan.maratonajava.javacore.A_Classes.domain;

    public class Employee {
        private String name;
        private int age;
        private double[] salaries;
        private double total;
        private double average;


        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            if (age < 0){
                System.out.println("Invalid age");
                return;
            }
            this.age = age;
        }

        public double[] getSalaries() {
            return salaries;
        }

        public void setSalaries(double[] salaries) {
            this.salaries = salaries;
        }


        public void printEmployee(){

            System.out.println("Name: " + this.name);
            System.out.println("Age: " + this.age);

            if (salaries == null) return;

            for(double salary : salaries){
            System.out.println("Salary: " + salary);
            }

            totalAndAverageSalary();

        }

        public double getTotal() {
            return total;
        }

        public double getAverage() {
            return average;
        }


        public void totalAndAverageSalary(){

            if (salaries == null) return;

            total = 0;
            for(double salary : salaries){
            total += salary;
            }

            System.out.println("Total: " + total);
            average = total / salaries.length;
            System.out.println("Average: " + average);

        }
    }



