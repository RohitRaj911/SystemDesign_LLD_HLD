package Observable;

import java.util.ArrayList;
import java.util.List;

import Observer.NotificationALertObserver;

public abstract class StockObservable {
    protected List<NotificationALertObserver> observerList = new ArrayList<>();
    protected int stockCount = 0;
    protected String deviceName;

    public StockObservable(String deviceName) {
        this.deviceName = deviceName;
    }

    public void add(NotificationALertObserver obj) {
        observerList.add(obj);
    }

    public void remove(NotificationALertObserver obj) {
        observerList.remove(obj);
    }

    public void setData(int newStockAdded) {
        if (stockCount == 0 && newStockAdded > 0) {
            NotifySubscriber();
        }
        stockCount += newStockAdded;
    }

    public void NotifySubscriber() {
        for (NotificationALertObserver alert : observerList) {
            alert.update();
        }
    }

    public int getData() {
        return stockCount;
    }

    public String getDeviceName() {
        return deviceName;
    }
}
