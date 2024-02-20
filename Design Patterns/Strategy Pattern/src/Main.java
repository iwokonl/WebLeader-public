import Doors.Lock.LockableImpl.NonLocking;
import Doors.Models.ClosetDoor;
import Doors.Models.Door;
import Doors.Open.OpenableImpl.Standard;

public class Main {
    public static void main(String[] args){
        Door closetDoor = new ClosetDoor();
        closetDoor.setOpenBehavior(new Standard());
        closetDoor.setLockBehavior(new NonLocking());

        closetDoor.performUnlock();
        closetDoor.performOpen();
        closetDoor.performClose();
        closetDoor.performLock();
    }
}
