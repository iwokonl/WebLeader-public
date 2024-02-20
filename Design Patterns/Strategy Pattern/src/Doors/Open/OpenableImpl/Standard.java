package Doors.Open.OpenableImpl;

import Doors.Open.Openable;

public class Standard implements Openable {
    @Override
    public void open() {
        System.out.println("Pushing door - open");
    }

    @Override
    public void close() {
        System.out.println("Pushing door - close");
    }
}
