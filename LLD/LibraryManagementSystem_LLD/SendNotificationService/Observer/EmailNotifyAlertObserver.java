package SendNotificationService.Observer;

import SendNotificationService.Observable.StockObservable;

public class EmailNotifyAlertObserver implements NotifyAlertObserver{
    String email;
    StockObservable stockObj;

    public EmailNotifyAlertObserver(StockObservable obj, String email){
        this.email=email;
        this.stockObj=obj;
    }

    public void update(String bookName){
        System.out.println("Hi, your "+ bookName + " is availaqble");
        sendMail();
    }   
    public void sendMail(){
        System.out.println("Email is sent at : "+ email);
    }
}
