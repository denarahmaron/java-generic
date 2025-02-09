package application;

import generic.MyData;

public class TypeErasureApp {
    public static void main(String[] args) {
        MyData stringData = new MyData("Coding");
        MyData<Integer> integerData = (MyData<Integer>) stringData;
        Integer integer = integerData.getData();
    }
}
