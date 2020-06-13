package Lesson_1;

public class Orange extends Number {

    double weight = 1.5;
//    int weight = 1;
//    long weight = 1;
//    double weight = 1.5;

    @Override
    public int intValue() {
        return (int) weight;
    }

    @Override
    public long longValue() {
        return (long) weight;
    }

    @Override
    public float floatValue() {
        return (float) weight;
    }

    @Override
    public double doubleValue() {
        return (double) weight;
    }
}
