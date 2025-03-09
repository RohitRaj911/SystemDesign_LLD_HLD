package SendNotificationService.Observable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import SendNotificationService.Observer.NotifyAlertObserver;

public class StockObservable {

    private Map<String, Integer> bookStock; // Book name -> Stock count
    List<NotifyAlertObserver>observerList;

    public StockObservable() {
        this.bookStock = new HashMap<>();
        this.observerList = new ArrayList<>();
    }

    public void addBook(String bookName, int available){
        bookStock.put(bookName, available);
    }

    public void addObserver(NotifyAlertObserver obj){
        observerList.add(obj);
    }

    public void removeObserver(NotifyAlertObserver obj){
        observerList.remove(obj);
    }

    public void updateLibraryStock(String bookName,int bookAvailable){
        if (!bookStock.containsKey(bookName)) {
            System.out.println("Error: Book '" + bookName + "' does not exist in the library.");
            return;
        }

        int newStock = bookStock.get(bookName) + bookAvailable;
        bookStock.put(bookName, newStock);

        if (newStock > 0) {
            notifyMember(bookName);
        } else {
            System.out.println("Book '" + bookName + "' is still not available.");
        }
    }

    public void notifyMember(String bookName){
        for(NotifyAlertObserver alert : observerList){
            alert.update(bookName);
        }   
    }

}
