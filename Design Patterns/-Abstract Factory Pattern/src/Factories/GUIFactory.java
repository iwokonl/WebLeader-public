package Factories;

import Models.Button;
import Models.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
