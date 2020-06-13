package Lesson_1;

public class Apple extends Number {

    float weight = 1.0f;
//    int weight = 1;
//    long weight = 1;
//    double weight = 1.0f;

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
