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
            nextLogProcesssor.log(logLevel, message);
        }
    }
}
