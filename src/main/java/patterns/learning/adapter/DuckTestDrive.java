package patterns.learning.adapter;

import patterns.learning.adapter.adapter.TurkeyAdapter;
import patterns.learning.adapter.entity.Duck;
import patterns.learning.adapter.entity.MallardDuck;
import patterns.learning.adapter.entity.WildTurkey;

public class DuckTestDrive {

    public static void main(String[] args) {
        MallardDuck duck = new MallardDuck();

        WildTurkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);


    }
}
