public class HW5 {
    public static void main(String[] args) {
        Employee[] empsArray = new Employee[5];
        empsArray[0] = new Employee("Ivanov Sergey", "Accountant", "SIvanov@mailbox.com", "892312312", 30000, 30);
        empsArray[1] = new Employee("Petrov Ivan", "Lawyer", "IPetrov@mailbox.com", "89129890909", 60000, 27);
        empsArray[2] = new Employee("Sinitsin Alexey", "Doctor", "ASinitsin@mailbox.com", "89213456532", 40000, 47);
        empsArray[3] = new Employee();
        empsArray[4] = new Employee("Kurochkin Andrey", "Driver", "AKurochkin@mailbox.com", "89196211209", 70000, 41);
        System.out.println();
        checkEmps(empsArray);


    }

    static void checkEmps(Employee[] empsArray) {
        for (int b = 0; b < empsArray.length; b++) {
            int age = empsArray[b].age;
            if (age > 40) {
                empsArray[b].printToConsole();
                System.out.println();
            }
        }
    }
}
