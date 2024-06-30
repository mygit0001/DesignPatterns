package org.example;

import org.example.buttons.Button;
import org.example.checkboxes.Checkbox;
import org.example.factories.GuiFactory;

public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GuiFactory factory){
        button=factory.createButton();
        checkbox=factory.createCheckbox();
    }

    public void paint(){
        button.paint();
        checkbox.paint();
    }
}
