package State;

/**
 * Created by admin on 05.05.2017.
 */
public class Main {
    public static void main(String[] args) {
        Document document = new Document();

        Send send = new Send();
        send.send(document);
    }
}
