package SendNotificationService;

import SendNotificationService.Observable.StockObservable;
import SendNotificationService.Observer.EmailNotifyAlertObserver;

public class Main {
    public static void main(String[] args) {
        
        StockObservable stockObservable = new StockObservable();
        StockObservable stockObservable2 = new StockObservable();
        //These are the books of library, which is having 0 book available
        stockObservable.addBook("Harry Potter", 0);
        stockObservable2.addBook("Pride and Prejudice", 0);
        stockObservable.addBook("The Lord of the Rings", 0);

        // Add observers
        EmailNotifyAlertObserver observer1 = new EmailNotifyAlertObserver(stockObservable, "user1@example.com");
        EmailNotifyAlertObserver observer2 = new EmailNotifyAlertObserver(stockObservable2, "user2@example.com");
        EmailNotifyAlertObserver observer3 = new EmailNotifyAlertObserver(stockObservable, "user3@example.com");

        stockObservable.addObserver(observer1);
        stockObservable2.addObserver(observer2);
        stockObservable.addObserver(observer3);

        //Someone return harrypotter book, now avaialble harrypotter is 1
        stockObservable.updateLibraryStock("Harry Potter", 1);
    }
}
