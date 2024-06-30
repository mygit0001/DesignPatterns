package org.example.factories;

import org.example.buttons.Button;
import org.example.buttons.WinButton;
import org.example.checkboxes.Checkbox;
import org.example.checkboxes.WinCheckbox;

public class WindowsFactory implements GuiFactory{
    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WinCheckbox();
    }
}
