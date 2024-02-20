package SmartHome;

import Models.Brightness;
import Models.Service;

class SmartHomeSubSystem {
    private Brightness brightness;
    private int temperature;
    private boolean isSecurityArmed;
    private Service streamingService;

    public Brightness getBrightness() {
        return brightness;
    }

    public void setBrightness(Brightness brightness) {
        this.brightness = brightness;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public boolean isSecurityArmed() {
        return isSecurityArmed;
    }

    public void setSecurityArmed(boolean securityArmed) {
        isSecurityArmed = securityArmed;
    }

    public Service getStreamingService() {
        return streamingService;
    }

    public void setStreamingService(Service streamingService) {
        this.streamingService = streamingService;
    }
}
