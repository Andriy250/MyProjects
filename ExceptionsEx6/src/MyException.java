import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

public class MyException extends Exception{

    public static Logger logger = Logger.getLogger("LoggingException");

    public MyException(){
        StringWriter trace = new StringWriter();
        printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
}
