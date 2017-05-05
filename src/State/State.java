package State;

/**
 * Created by admin on 05.05.2017.
 */
public abstract class State {
    enum DocState {Send, New, Podpis, ErrorPodpis, End};

    private DocState docState;
    public abstract boolean send(Document document);
    public abstract boolean newDoc(Document document);
    public abstract boolean podpis(Document document);
    public abstract boolean errorPodpis(Document document);
    public abstract boolean endState(Document document);

}
