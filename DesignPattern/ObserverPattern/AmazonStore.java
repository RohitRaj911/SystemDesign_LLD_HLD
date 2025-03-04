import Observable.IphoneObservable;
import Observable.StockObservable;
import Observable.TVObservable;
import Observer.EmailObserverImpl;
import Observer.NotificationALertObserver;
import Observer.PhoneObserverImpl;

public class AmazonStore {
    public static void main(String[] args) {
        StockObservable iphoneObj = new IphoneObservable();
        StockObservable TVObj = new TVObservable();

        NotificationALertObserver notifyObj = new EmailObserverImpl("r.rohitraj@gmail.com", iphoneObj);
        NotificationALertObserver notifyObj2 = new PhoneObserverImpl("9876789023", TVObj);

        iphoneObj.add(notifyObj);
        iphoneObj.setData(10);

        TVObj.add(notifyObj2);
        TVObj.setData(5);
    }
}
