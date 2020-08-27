public class MainClass {

    public static void main(String[] args) {

        Employee[] employee = new Employee[5];
        employee[0] = new Employee("Dralin M.M.", 30000, 35);
        employee[1] = new Employee("Inanov I.I.", 35000, 29);
        employee[2] = new Employee("Petrov A.B.", 40000, 40);
        employee[3] = new Employee("Mamaev A.B.", 45000, 41);
        employee[4] = new Employee("Egorov E.E.", 50000, 45);

        for (Employee value : employee) {
            if (value.salary > 40000) {
                System.out.println("ФИО: " + value.fio);
                System.out.println("Salary: " + value.salary);
                System.out.println("Age: " + value.age);
            }
        }
        System.out.println("LaLaLaaaaaaaaaa");

        System.out.println("Hello my friend !");
        System.out.println("Вот так вот");
        System.out.println("Вот так вот");
    }
}
