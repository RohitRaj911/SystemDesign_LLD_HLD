public class InfoLogProcesssor extends LogProcesssor {

    InfoLogProcesssor(LogProcesssor nextLogProcesssor){
        super(nextLogProcesssor);
    }

    public void log(int logLevel, String message){
        if(logLevel==INFO){
            System.out.println("INFO: " + message);
        } else{
            super.log(logLevel, message);
        }
    }
}
