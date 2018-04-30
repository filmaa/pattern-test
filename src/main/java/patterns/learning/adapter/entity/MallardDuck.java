package patterns.learning.adapter.entity;

public class MallardDuck implements Duck {
    public void quack() {
        System.out.println("quack");
    }

    public void fly() {
        System.out.println("Flying");
    }
}
