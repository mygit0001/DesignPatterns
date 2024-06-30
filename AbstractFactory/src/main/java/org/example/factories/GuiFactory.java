package org.example.factories;

import org.example.buttons.Button;
import org.example.checkboxes.Checkbox;

public interface GuiFactory {

    Button createButton();
    Checkbox createCheckbox();
}
