package Observer;

import Observable.StockObservable;

public class EmailObserverImpl implements NotificationALertObserver{
    String email;
    StockObservable observableObj;
    public EmailObserverImpl(String email, StockObservable obj){
        this.email = email;
        this.observableObj = obj;
    }
    public void update(){
        System.out.println("Hi, your "+ observableObj.getDeviceName() + " is availaqble");
        sendMail();
    }   
    public void sendMail(){
        System.out.println("Email is sent at : "+ email);
    }
}
