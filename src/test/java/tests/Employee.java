package tests;

public class Employee {
    String fio;
    int salary;
    int age;

    public Employee() {
    }

    public Employee(String fio, int salary, int age) {
        this.fio = fio;
        this.salary = salary;
        this.age = age;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void addSalary(int salary, int age, int k, int b) {
        if (age > k) {
            this.salary += b;
        }
    }
}
