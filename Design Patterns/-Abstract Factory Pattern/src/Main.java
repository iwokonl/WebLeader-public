import Factories.FactoriesImpl.WinFactory;
import Factories.GUIFactory;
import Models.Button;

public class Main {
    public static void main(String[] args) {
        GUIFactory factory = new WinFactory();
        Application app = new Application(factory);
        app.createUI();
        app.button.paint("blue");
        app.checkbox.check();
        app.checkbox.uncheck();
        System.out.println(app.button);
        System.out.println(app.checkbox);
    }
}