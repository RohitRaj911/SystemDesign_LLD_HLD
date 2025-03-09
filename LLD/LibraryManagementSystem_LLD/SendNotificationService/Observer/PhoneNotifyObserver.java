package SendNotificationService.Observer;

import SendNotificationService.Observable.StockObservable;

public class PhoneNotifyObserver  implements NotifyAlertObserver{
    String phone;
    StockObservable stockObj;

    public PhoneNotifyObserver(StockObservable obj, String phone){
        this.phone = phone;
        this.stockObj = obj;
    }

    public void update(String bookName){
        System.out.println("Hi, your "+ bookName + " is availaqble");
        sendSms();
    }   
    public void sendSms(){
        System.out.println("SMS is sent at : "+ phone);
    }
}
