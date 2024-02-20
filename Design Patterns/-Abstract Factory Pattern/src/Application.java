import Factories.GUIFactory;
import Models.Button;
import Models.Checkbox;

public class Application {

    GUIFactory factory;
    Button button;
    Checkbox checkbox;

    Application(GUIFactory factory){
        this.factory = factory;
    }

    public void createUI(){
        this.button = factory.createButton();
        this.checkbox = factory.createCheckbox();
    }

    public void paint(String color){
        button.paint(color);
    }

    public void check(){
        checkbox.check();
    }

    public void uncheck(){
        checkbox.uncheck();
    }
}
