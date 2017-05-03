package prototype;

/**
 * Created by admin on 03.05.2017.
 */
public class House implements Cloneable {
    private int peopleCount;
    private int number;

    public House(int peopleCount, int number) {
        this.peopleCount = peopleCount;
        this.number = number;
    }
}
