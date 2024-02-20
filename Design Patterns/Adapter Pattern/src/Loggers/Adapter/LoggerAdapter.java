package Loggers.Adapter;

import Loggers.JsonLogger;
import Loggers.XmlLogger;

public class LoggerAdapter implements JsonLogger {

    public XmlLogger xmlLogger;

    public LoggerAdapter(XmlLogger xmlLogger){
        this.xmlLogger = xmlLogger;
    }

    @Override
    public void logMessage(String message) {
        xmlLogger.log(message);
    }
}
