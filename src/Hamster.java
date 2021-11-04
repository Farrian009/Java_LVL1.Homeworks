public class Hamster {
    private String name;
    private int appetite;
    private boolean satiation;

    public Hamster(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        satiation = false;
    }

    public void eat(Plate plate) {
        if (plate.checkFoodAmount(appetite) && !satiation) {
            plate.decreaseFood(appetite);
            satiation = true;
            System.out.println(name + " has eaten.");
        } else if (satiation) {
            System.out.println(name + " is stuffed.");
        } else {
            System.out.println("There aren't sufficient food amount in plate");
        }
    }


}
