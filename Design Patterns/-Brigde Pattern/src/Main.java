import Models.AdvancedRemote;
import Models.Devices.Device;
import Models.Devices.DevicesImpl.TV;

public class Main {
    public static void main(String[] args) {
        Device tv = new TV();
        AdvancedRemote remote = new AdvancedRemote(tv);
        remote.volumeUp();
        System.out.println(tv.getVolume());
        remote.channelUp();
        System.out.println(tv.getChannel());
    }
}