package patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Publisher implements PublisherInterface {

    private List<PublisherActionListener> listeners = new ArrayList<>();

    @Override
    public List<PublisherActionListener> getListeners() {
        return listeners;
    }

    @Override
    public void addListener(PublisherActionListener listener) {
        listeners.add(listener);
    }

    @Override
    public void removeListener(PublisherActionListener listener) {
        listeners.remove(listener);
    }

    @Override
    public void removeAllListeners() {
        listeners.clear();
    }

    @Override
    public void notifySubscribers(String msg) {
        listeners.forEach(e->e.doAction(msg));
    }

    public void createNewMsg(String msg){
        notifySubscribers(msg);
    }
}
