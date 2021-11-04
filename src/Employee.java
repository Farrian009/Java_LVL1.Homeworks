public class Employee {

    // for HW5
    String name;
    String position;
    String email;
    String phoneNumber;
    int salary;
    int age;
    Employee () {
        this.name = "Sidorov Vasyly";
        this.position = "Engineer";
        this.email = "VSidorov@mailbox.com";
        this.phoneNumber = "89170909090";
        this.salary = 50000;
        this.age = 24;
    }
    Employee (String name, String position, String email, String phoneNumber, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }
    void printToConsole() {
        System.out.println("Employee information: ");
        System.out.println("Name - " + name);
        System.out.println("Position - " + position);
        System.out.println("Phone number - " + phoneNumber);
        System.out.println("E-mail - " + email);
        System.out.println("Salary - " + salary);
        System.out.println("Age - " + age);
    }




}
