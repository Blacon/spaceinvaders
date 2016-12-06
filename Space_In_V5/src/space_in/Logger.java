package space_in;

public class Logger {
    private volatile static Logger instance = null;
    
    //String text = "tick";
    
    private Logger(){}
    
    public static Logger getInstance()
    {
        if(instance == null)
        {
            instance = new Logger();
        }
        
        return instance;
    }
    
//    public String getMessage()
//    {
//        return instance.text;
//    }
    
    public void logMessage(int i)
    {
        System.out.println("tick " + i);
    }
}
