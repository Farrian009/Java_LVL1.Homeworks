public class Cat extends Animal {
    static int numb3;
    Cat(String name) {
        super(name);
        numb3++;
    }
    @Override
    void run (int b) {
        if (b <= 200) {
            System.out.println(name + " have ran " + b + " meters.");

        } else if (b < 0) {
            System.out.println("Input correct value.");

        }
        else {
            System.out.println("Cats can't run more than 200 meters.");;
        }
    }
    @Override
    void swim (int c) {
        System.out.println("Cats don't swim.");
    }
    public static int counter(){
        return numb3;
    }
    public static void getСounter(){
        System.out.println("Have been created " + numb3 + " objects class Cat.");
    }
}
