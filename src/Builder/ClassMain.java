package Builder;

import Builder.Galastyan.DjamshutBuilder;
import Builder.Svetlakov.Boss;

/**
 * Created by admin on 03.05.2017. 123
 */
public class ClassMain {
    public static void main(String[] args) {
        DjamshutBuilder builderDj = new DjamshutBuilder();

        Boss boss = new Boss(builderDj);
        boss.build();
    }
}
