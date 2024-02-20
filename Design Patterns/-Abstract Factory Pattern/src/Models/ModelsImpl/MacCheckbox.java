package Models.ModelsImpl;

import Models.Checkbox;

public class MacCheckbox implements Checkbox {

    @Override
    public void check() {
        System.out.println("Checkbox checked");
    }

    @Override
    public void uncheck() {
        System.out.println("Checkbox unchecked");
    }

    @Override
    public String toString(){
        return "I'm a MacCheckbox";
    }
}
