package SmartHome;

import Models.Brightness;
import Models.Service;

public class SmartHomeFacade {
    private SmartHomeSubSystem smartHome;

    public SmartHomeFacade() {
        this.smartHome = new SmartHomeSubSystem();
    }

    public void setMovieMode(){
        smartHome.setBrightness(Brightness.DIM);
        smartHome.setTemperature(21);
        smartHome.setSecurityArmed(false);
        smartHome.setStreamingService(Service.NETFLIX);
    }

    public void setFocusMode(){
        smartHome.setBrightness(Brightness.BRIGHT);
        smartHome.setTemperature(22);
        smartHome.setSecurityArmed(true);
        smartHome.setStreamingService(Service.UNKNOWN);
    }
}
