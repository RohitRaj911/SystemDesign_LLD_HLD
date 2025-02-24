public abstract class LogProcesssor {
    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;
    
    LogProcesssor nextLogProcesssor;

    LogProcesssor(LogProcesssor loggerProcesssor){
        this.nextLogProcesssor = loggerProcesssor;
    }
    public void log(int logLevel, String message){
        if(nextLogProcesssor!=null){
            System.out.println("BEFORE::  "+nextLogProcesssor.toString());
            nextLogProcesssor.log(logLevel, message);
            System.out.println("AFTER::  "+nextLogProcesssor.toString());
        }
    }
}
