package Factories.FactoriesImpl;

import Factories.GUIFactory;
import Models.Button;
import Models.Checkbox;
import Models.ModelsImpl.WinButton;
import Models.ModelsImpl.WinCheckbox;

public class WinFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WinCheckbox();
    }
}
