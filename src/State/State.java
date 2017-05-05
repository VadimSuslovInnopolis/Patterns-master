package State;

/**
 * Created by admin on 05.05.2017.
 */
public abstract class State {
    enum DocState {Send, New, Podpis, ErrorPodpis, End};

    private DocState docState;
    public abstract boolean send();
    public abstract boolean newDoc();
    public abstract boolean podpis();
    public abstract boolean errorPodpis();
    public abstract boolean endState();

}
