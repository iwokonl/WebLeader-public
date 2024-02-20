package Models.ModelsImpl;

import Models.Button;

public class WinButton implements Button {

    @Override
    public void paint(String color) {
        System.out.println("Button painted " + color);
    }

    @Override
    public String toString(){
        return "I'm a WinButton";
    }


}
