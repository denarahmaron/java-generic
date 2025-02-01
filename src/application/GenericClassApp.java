package application;

import generic.MyData;

public class GenericClassApp {
    public static void main(String[] args) {
        MyData<String> myDataString = new MyData<>("Denar");
        MyData<Integer> myDataInteger = new MyData<>(100);
        MyData<Boolean> myDataBoolean = new MyData<>(true);

        System.out.println(myDataString.getData());
        System.out.println(myDataInteger.getData());
        System.out.println(myDataBoolean.getData());
    }
}
