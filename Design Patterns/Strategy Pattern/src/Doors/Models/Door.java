package Doors.Models;

import Doors.Lock.Lockable;
import Doors.Open.Openable;

public class Door {
    private Lockable lockable;
    private Openable openable;

    public void setLockBehavior(Lockable lockable){
        this.lockable = lockable;
    }

    public void setOpenBehavior(Openable openable){
        this.openable = openable;
    }

    public void performOpen(){
        openable.open();
    }

    public void performClose(){
        openable.close();
    }

    public void performLock(){
        lockable.lock();
    }

    public void performUnlock(){
        lockable.unlock();
    }

    public float getDimensions(){
        return 5;
    }
}
