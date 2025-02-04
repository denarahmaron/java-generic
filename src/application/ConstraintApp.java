package application;

public class ConstraintApp {
    public static void main(String[] args) {
        NumberData<Integer> integerNumberData = new NumberData<>(200);

//        NumberData<String> stringNumberData = new NumberData<String>("Denar"); Error
    }
    public static class NumberData<T extends Number>{
        public T data;

        public NumberData(T data){
            this.data = data;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }
    }
}
