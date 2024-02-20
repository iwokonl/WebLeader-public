import Loggers.Adapter.LoggerAdapter;
import Loggers.JsonLogger;
import Loggers.XmlLogger;

public class Main {
    public static void main(String[] args){
        JsonLogger jsonLogger = new LoggerAdapter(new XmlLogger());
        jsonLogger.logMessage("<message>hello</message>");
    }
}
