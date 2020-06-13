package Lesson_1;

import java.util.ArrayList;

public class Jeneric<T> {
    private ArrayList<T> arr = new ArrayList<>();
    public Jeneric(T... arr) {
        for (int i = 0; i < arr.length; i++) {
            this.arr.add(arr[i]);
        }
    }
    public ArrayList<T> getArr() {
        return arr;
    }
}
