package patterns.behavioral.observer;

import java.util.List;

public interface PublisherInterface {

    List<PublisherActionListener> getListeners();
    void addListener(PublisherActionListener listener);
    void removeListener(PublisherActionListener listener);
    void removeAllListeners();
    void notifySubscribers(String msg);
}
