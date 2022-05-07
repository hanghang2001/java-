package lambda;

public class Demo1 {
    public static void main(String[] args) {
//        Swimming s1 = new Swimming() {
//            @Override
//            public void swim() {
//                System.out.println("快");
//            }
//        };
        //简化
        Swimming s1 = () ->  System.out.println("老师很快~~~~~~~~~~~~");
        go(s1);

//        go(new Swimming() {
//            @Override
//            public void swim() {
//                System.out.println("学生们游的很开心");
//            }
//        });
        //简化
//        go(() ->{
//            System.out.println("学生们游的很开心");
//        });

        go(() -> System.out.println("学生们游的很开心") );
    }

    public static void go(Swimming s){
        System.out.println("开始");
        s.swim();
        System.out.println("结束");
    }
}

interface Swimming{
    void swim();
}