package Doors.Lock.LockableImpl;

import Doors.Lock.Lockable;

public class KeyCard implements Lockable {

    @Override
    public void lock() {
        System.out.println("Door locked at the moment of closing!");
    }

    @Override
    public void unlock() {
        System.out.println("Door unlocked by using a key card!");
    }
}
