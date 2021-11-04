public class Plate {
    private  int food;
    public Plate(int food) {
        this.food = food;
    }
    public void info() {
        System.out.println("Plate: " + food);
    }
    public void decreaseFood(int appetite) {
        if (!checkFoodAmount(appetite)) {
            System.out.println("There aren't sufficient food amount");

        } else {
            this.food -= appetite;
        }
    }
    public void increaseFood(int addFood) {
        this.food += addFood;
    }
    public boolean checkFoodAmount(int appetite) {
        return appetite <= food;
    }

}