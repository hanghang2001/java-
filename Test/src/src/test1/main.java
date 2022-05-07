package test1;

public class main {
    public static void main(String[] args) {
        Animal a = new Animal() {
            @Override
            public void run() {
                System.out.println("老虎跑得快");
            }
        };
        a.run();
    }
}

//class Tiger extends Animal{
//
//    @Override
//    public void run() {
//
//    }
//}

abstract class Animal{
    public abstract void run();
}
