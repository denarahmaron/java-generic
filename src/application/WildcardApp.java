package application;

import generic.MyData;

public class WildcardApp {
    public static void main(String[] args) {
        printLength(new MyData<>(100));
        printLength(new MyData<>("Denar"));
        printLength(new MyData<>(true));
    }

    public static void printLength(MyData<?> data){
        System.out.println(data.getData());
    }
}
