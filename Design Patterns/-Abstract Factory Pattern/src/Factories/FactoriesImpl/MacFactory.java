package Factories.FactoriesImpl;

import Factories.GUIFactory;
import Models.Button;
import Models.Checkbox;
import Models.ModelsImpl.MacButton;
import Models.ModelsImpl.MacCheckbox;

public class MacFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }
}
