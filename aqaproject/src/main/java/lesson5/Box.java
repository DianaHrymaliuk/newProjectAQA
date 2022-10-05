package lesson5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Box<T extends Fruit> {
    public List<T> box;

    public Box() {
        box = new ArrayList<T>();
    }

    public List<T> getBox() {
        return box;
    }

    public Box(T a) {
        this.box = Arrays.asList(a);
    }

    public void addFruit(T a) {
        box.add(a);
    }

    float getWeight() {
        if (box.isEmpty()) {
            return 0;
        } else {
            return box.size() * box.get(0).getWeight();
        }
    }

    public boolean compare(Box<? extends Fruit> box) {
        return Math.abs(this.getWeight() - box.getWeight()) < 0.0001;
    }

    private void clear() {
        box.clear();
    }

//    public void sprinkle(Box<? extends Fruit> box1) {
//        if (this.box.isEmpty() || box1.box.get(0).equals(this.box.get(0))) {
//        System.out.println("The fruits of one type in the boxes");
//        //box1.box.addAll(this.box);
//        //clear();
//        }
//        else{
//         System.out.println("The fruits of different types in the boxes");}
//    }
}


