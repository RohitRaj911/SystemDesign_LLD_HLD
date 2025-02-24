public class DebugLogProcesssor extends LogProcesssor {
    DebugLogProcesssor(LogProcesssor nextLogProcesssor){
        super(nextLogProcesssor);
    }

    public void log(int logLevel, String message){
        if(logLevel==DEBUG){
            System.out.println("DEBUG: " + message);
        } else{
            super.log(logLevel, message);
        }
    }
}
