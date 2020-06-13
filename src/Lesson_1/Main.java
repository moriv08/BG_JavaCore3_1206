package Lesson_1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        Integer[] arrInt = {1, 2, 3, 4, 5};
        String[] arrStr = {"one", "two", "three", "fore"};

        // Exercise 1 Написать метод, который меняет два элемента массива местами.(массив может быть любого ссылочного типа);
        System.out.print("Не измененный массив ");
        print(arrInt);
        changeElem(arrInt, 1, 5);
        System.out.print("Измененный массив ");
        print(arrInt);
        System.out.println("___________");

        // Exercise 2 Написать метод, который преобразует массив в ArrayList;
        ArrayList<Integer> arrInteger = makeArray(arrInt);
        ArrayList<String> arrString = makeArray(arrStr);
        ArrayList<Integer> arrInteger2 = makeConstrArray(arrInt);
        ArrayList<String> arrString2 = makeConstrArray(arrStr);

        System.out.println(arrInteger);
        System.out.println(arrString);
        System.out.println(arrInteger2);
        System.out.println(arrString2);
        System.out.println("___________");

        // Exercise 3 Большая задача:
        // exercise 3 (b)
        Box<Apple> firstAppleBox = new Box<>(new Apple(), new Apple(), new Apple(), new Apple(), new Apple(), new Apple());
        Box<Orange> firstOrangeBox = new Box<>(new Orange(), new Orange(), new Orange(), new Orange());
        Box<Apple> emptyAppleBox = new Box<>();

        // exercise 3 (d)
        firstAppleBox.getWeight();
        firstOrangeBox.getWeight();

        // exercise 3 (e)
        if (firstAppleBox.compare(firstOrangeBox))
            System.out.println("У коробок одинаковый вес");
        else
            System.out.println("У коробок не одинаковый вес");
        System.out.println("___________");

        System.out.println("Вес emptyAppleBox " + emptyAppleBox.getWeight());
        System.out.println("Вес firstAppleBox " + firstAppleBox.getWeight());
        System.out.println("Вес firstOrangeBox " + firstOrangeBox.getWeight());
        System.out.println("___________");

        // exercise 3 (f)
        emptyAppleBox.pour(firstAppleBox);
        System.out.println("Вес emptyAppleBox после того как её наполнили яблаками " + emptyAppleBox.getWeight() +
                ", а вес firstAppleBox после того как из нее высыпали яблоки составляет " + firstAppleBox.getWeight());
        // exercise 3 (g)
        Box.addOne(emptyAppleBox, new Apple());
        System.out.println("Вес emptyAppleBox++ " + emptyAppleBox.getWeight());
        System.out.println("___________");

    }

    // Exercise 1

    private static <T> void changeElem(T[] arr, int i, int b){

        T tmp = arr[i - 1];
        arr[i - 1] = arr[b - 1];
        arr[b - 1] = tmp;

    }

    private static <T> void print(T[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
    }

    // Exercise 2
    private static <T> ArrayList makeArray(T[] arr){
        ArrayList<T> arrayList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++)
            arrayList.add(arr[i]);
        return arrayList;
    }

    private static <T> ArrayList makeConstrArray(T[] arr){
        Jeneric jen = new Jeneric(arr);
        return jen.getArr();
    }

}
