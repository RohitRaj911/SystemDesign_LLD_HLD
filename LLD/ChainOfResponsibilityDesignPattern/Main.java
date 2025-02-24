public class Main{
    public static void main(String[]args){
        LogProcesssor logObject = new InfoLogProcesssor(new DebugLogProcesssor(new ErrorLogProcesssor(null)));
        logObject.log(LogProcesssor.ERROR, "exception happens");
        logObject.log(LogProcesssor.DEBUG, "need to debug this ");
        logObject.log(LogProcesssor.INFO, "just for info ");
    }
}