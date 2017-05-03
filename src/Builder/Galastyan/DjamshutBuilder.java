package Builder.Galastyan;

import Builder.HouseBuilder;

/**
 * Created by admin on 03.05.2017. 123
 */
public class DjamshutBuilder implements HouseBuilder {
    private String basement;
    private String walls;
    private String roof;

    @Override
    public void fillBasement() {

        basement = "Djamshut create all";
    }

    @Override
    public void createWalls() {
        walls = " red";

    }

    @Override
    public void createRoof() {
        roof = " line";

    }
    @Override
    public String getResult() {
        return basement + " " + roof + " " + walls;
    }
}
