package Observer;

import Observable.StockObservable;

public class PhoneObserverImpl implements NotificationALertObserver{
    String phoneNum;
    StockObservable observableObj;
    public PhoneObserverImpl(String phone, StockObservable obj){
        this.phoneNum = phone;
        this.observableObj = obj;
    }
    public void update(){
        System.out.println("Hi, your "+ observableObj.getDeviceName() + " is available");
        sendMail();
    }   
    public void sendMail(){
        System.out.println("SMS is sent at : "+ phoneNum);
    } 
}
