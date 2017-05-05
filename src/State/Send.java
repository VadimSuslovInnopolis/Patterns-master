package State;

/**
 * Created by admin on 05.05.2017.
 */
public class Send extends State {
    @Override
    public boolean send() {
        return true;
    }

    @Override
    public boolean newDoc() {
        return false;
    }

    @Override
    public boolean podpis() {
        return false;
    }

    @Override
    public boolean errorPodpis() {
        return false;
    }

    @Override
    public boolean endState() {
        return false;
    }
}
