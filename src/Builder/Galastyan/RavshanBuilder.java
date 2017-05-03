package Builder.Galastyan;

import Builder.HouseBuilder;

/**
 * Created by admin on 03.05.2017. 123
 */
public class RavshanBuilder implements HouseBuilder {
    private String basement;
    private String walls;
    private String roof;

    @Override
    public void fillBasement() {
        basement = "Ravsan create all";
    }

    @Override
    public void createWalls() {

        walls = " black";
    }

    @Override
    public void createRoof() {

        roof = " line1";
    }
    public String getResult() {
        return basement + " " + roof + " " + walls;
    }
}
