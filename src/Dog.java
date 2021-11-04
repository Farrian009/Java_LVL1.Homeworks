public class Dog extends Animal {
    static int numb2;
    Dog(String name) {
        super(name);
        numb2++;
    }
    @Override
    void run (int b) {
        if (b <= 500) {
            System.out.println(name + " have ran " + b + " meters.");

        } else if (b < 0) {
            System.out.println("Input correct value.");

        }
        else {
            System.out.println("Dogs can't run more than 500 meters.");;
        }
    }
    @Override
    void swim (int c) {
        if (c <= 10) {
            System.out.println(name + " have ran " + c + " meters.");

        } else if (c < 0) {
            System.out.println("Input correct value.");

        }
        else {
            System.out.println("Dogs can't swim more than 10 meters.");;
        }
    }
    public static int counter(){
        return numb2;
    }
    public static void getСounter(){
        System.out.println("Have been created " + numb2 + " objects class Dog.");
    }
}

