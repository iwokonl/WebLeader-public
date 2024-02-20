package Models;

import Models.Devices.Device;

public class Remote {
    Device device;
    public Remote(Device device){
        this.device = device;
    }

    public void togglePower(){
        device.enable();
    }

    public void volumeDown(){
        device.setVolume(device.getVolume() - 5);
    }

    public void volumeUp(){
        device.setVolume(device.getVolume() + 5);
    }

    public void channelDown(){
        device.setChannel(device.getChannel() - 1);
    }

    public void channelUp(){
        device.setChannel(device.getChannel() + 1);
    }
}
