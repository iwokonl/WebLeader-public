package Doors.Lock.LockableImpl;

import Doors.Lock.Lockable;

public class NonLocking implements Lockable {

    @Override
    public void lock() {
        System.out.println("Door does not look - ignoring");
    }

    @Override
    public void unlock() {
        System.out.println("Door cannot unlock, because it cannot lock");
    }
}
