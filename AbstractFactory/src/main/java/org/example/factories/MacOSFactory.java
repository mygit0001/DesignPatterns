package org.example.factories;

import org.example.buttons.Button;
import org.example.buttons.MacButton;
import org.example.checkboxes.Checkbox;
import org.example.checkboxes.MacCheckbox;

public class MacOSFactory implements GuiFactory{
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }
}
