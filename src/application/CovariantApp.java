package application;

import generic.MyData;

public class CovariantApp {
    public static void main(String[] args) {
        MyData<String> myData = new MyData<>("Coding");
        process(myData);
    }

    public static void process(MyData<? extends Object> myData){
        System.out.println(myData.getData());
//        myData.setData("Code"); error
    }
}
