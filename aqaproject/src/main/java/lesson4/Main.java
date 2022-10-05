package lesson4;

public class Main {
    public static void main(String[] args) {
        Cat sharik = new Cat("Sharik", 30, false);
        sharik.run(13);
        sharik.swim(30);
        Plate plate1 = new Plate(50); // - Тарелка №1
        sharik.eat(plate1);
        plate1.info();

        Dog sirko = new Dog();
        sirko.swim(5);
        sirko.run(10);

        Cat[] myCats = new Cat[5];
        myCats[0] = new Cat("Маркиз", 20, false);
        myCats[1] = new Cat("Юки", 50, false);
        myCats[2] = new Cat("Асуна", 25, false);
        myCats[3] = new Cat("Феликс", 15, false);
        myCats[4] = new Cat("Василий", 20, false);

        Plate plate2 = new Plate(100); // - Тарелка №2
        plate2.info();

        for (int i = 0; i < myCats.length; i++) {
            myCats[i].eat(plate2);
            if (myCats[i].fullnes == false && myCats[i].appetite <= plate2.food) {
                myCats[i].fullnes = true;
                System.out.println("Котик сыт на " + myCats[i].appetite);
            }
        }
        plate2.info();
        plate2.addFood(50);
        myCats[3].eat(plate2);
        plate2.info();
    }
}

