public class HW7 {
    public static void main(String[] args) {
        Hamster[] hamstersArr = new Hamster[4];
        hamstersArr[0] = new Hamster("Homa", 10);
        hamstersArr[1] = new Hamster("Jack", 15);
        hamstersArr[2] = new Hamster("Lin", 5);
        hamstersArr[3] = new Hamster("Pet", 7);
        Plate plate = new Plate(30);
        plate.info();

        for (int Hamster = 0; Hamster < hamstersArr.length; Hamster++) {
            hamstersArr[Hamster].eat(plate);
            }
        }

    }

