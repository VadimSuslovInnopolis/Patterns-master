package State;

/**
 * Created by admin on 05.05.2017.
 */
public class Send extends State {
    @Override
    public boolean send(Document document) {
        return true;
    }

    @Override
    public boolean newDoc(Document document) {
        return false;
    }

    @Override
    public boolean podpis(Document document) {
        return false;
    }

    @Override
    public boolean errorPodpis(Document document) {
        return false;
    }

    @Override
    public boolean endState(Document document) {
        return false;
    }
}
