package application;

import util.ArrayHelper;

public class ArrayHelperApp {
    public static void main(String[] args) {
        String[] names = {"Denar", "Ahmaron", "Surya"};
        Integer[] values = {1,10,100,1000};

        System.out.println(ArrayHelper.count(names));
        System.out.println(ArrayHelper.count(values));
    }
}
