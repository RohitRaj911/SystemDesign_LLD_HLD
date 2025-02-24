public class ErrorLogProcesssor extends LogProcesssor{
    ErrorLogProcesssor(LogProcesssor nextLogProcesssor){
        super(nextLogProcesssor);
    }

    public void log(int logLevel, String message){
        if(logLevel==ERROR){
            System.out.println("ERROR: " + message);
        } else{
            super.log(logLevel, message);
        }
    }
}
