public class HW1 {
    public static void main(String[] args) {
        byte x = 2;
        short y = -2577;
        int z;
        long q = 59438529L;
        float f = 3.1f;
        double v = 56.743;
        z = 13;
        char var2 = 'T';
        boolean k = false;


        float a = 0f, b = 4.8f, c = 3.2f, d = 1f;
        float s = a * (b + (c / d));
        System.out.println("Equation is " + s);

        check(0);
        compare(6);
        Hello("Tanya");
        year(900);


    }

    static void result(String[] args) {
        int o = 7, w = 7;
        boolean m;
        if (10 < (o + w) && (o + w) < 20) {
            m = true;
        } else {
            m = false;
        }
    }

    static void check(int l) {
        if (l >= 0) {
            System.out.println("Number " + l + " is positive");
        } else {
            System.out.println("Number " + l + " is negative");
        }
    }

    static void compare(int l) {
        boolean m;
        if (l >= 0) {
            m = false;
        } else {
            m = true;
        }
    }

    public static void Hello(String name) {
        System.out.println("Hello, " + name + "!");
    }

    static void year(int year) {
        int a = year % 4;
        int b = year % 100;
        int c = year % 400;
        if (c==0) {
            System.out.println(year + " is leap year");
        }
        else if (a == 0 && b != 0) {
            System.out.println(year + " is leap year");
        } else {
            System.out.println(year + " isn't leap year");
        }
    }
}


