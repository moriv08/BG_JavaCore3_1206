package Lesson_1;

import java.util.ArrayList;

public class Box<T extends Number> {

    ArrayList<T> arrayList = new ArrayList<>();

    Box(T... arr){
        for (int i = 0; i < arr.length; i++) {
            arrayList.add(arr[i]);
        }
    }

    public double getWeight(){
        double weight = 0.0;
        if (arrayList.size() > 0)
            weight = arrayList.size() * arrayList.get(0).doubleValue();
//        if (arrayList.size() == 0){
//            System.out.println("Box is empty");
//        }else {
//            String name = arrayList.get(0).getClass().getName().substring(9, arrayList.get(0).getClass().getName().length());
//            System.out.println("Weight of all " + name + " fruts is " + (weight));
//        }
        return weight;
    }

    public boolean compare(Box box){
//        System.out.println("This box weights " + this.getWeight() + " and the other box weights " + box.getWeight());
        return this.getWeight() == box.getWeight();
    }

    public boolean pour(Box box){
        if (box.arrayList.size() == 0)
            return false;
            for (int i = box.arrayList.size() - 1; i >= 0; i--) {
                this.arrayList.add((T) box.arrayList.get(i));
                box.arrayList.remove(i);
            }
        return true;
    }

    public static <T> void addOne(Box box, T elem){
        box.arrayList.add(elem);
    }

}
