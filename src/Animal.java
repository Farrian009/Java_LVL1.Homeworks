public class Animal {
    protected String name;
    static int numb;
    Animal (String name) {
        this.name = name;
        numb++;
    }

    void run (int b) {
        System.out.println(name + " have ran " + b + " meters.");
    }

    void swim (int c) {
        System.out.println(name + " have swam " + c + " meters.");
    }
    public static int counter(){
        return numb;
    }
    public static void getСounter(){
        System.out.println("Have been created " + numb + " objects class Animal.");
    }
}
