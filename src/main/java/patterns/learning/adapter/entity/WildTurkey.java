package patterns.learning.adapter.entity;

public class WildTurkey implements Turkey {

    public void gobble() {
        System.out.println("gobble gooble");
    }

    public void fly() {
        System.out.println("I'm flying short distance");
    }
}
