package application;

public class MultipleConstraintApp {
    public static void main(String[] args) {
//        Data<Manager> managerData = new Data<Manager>(new Manager()); Manager tidak implement CanSayhello
        Data<VicePresident> vicePresidentData = new Data<>(new VicePresident());
        vicePresidentData.getData().sayHello("Denar");
    }

    public static interface CanSayhello {
        void sayHello(String name);
    }

    public static abstract class Employee{

    }

    public static class Manager extends Employee{

    }

    public static class VicePresident extends Employee implements CanSayhello{
        @Override
        public void sayHello(String name) {
            System.out.println("Hello " + name);
        }
    }

    public static class Data <T extends Employee & CanSayhello>{
        public T data;

        public Data(T data) {
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
