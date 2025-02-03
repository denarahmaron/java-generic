package application;

import generic.MyData;

public class ContravariantApp {
    public static void main(String[] args) {
        MyData<Object> objectMyData = new MyData<>("Denar");
//        objectMyData.setData(100); // Be Careful to set data in contravariant
        MyData<? super String> stringMyData = objectMyData;
        process(objectMyData);

        System.out.println(objectMyData.getData());
    }

    private static void process(MyData<? super String> myData){
        String value = (String) myData.getData();
        System.out.println("Process param " + value);

        myData.setData("Code");
    }
}
