package org.example.buttons;

import org.example.buttons.Button;

public class WinButton implements Button {

    @Override
    public void paint() {
        System.out.println("You have created a Windows button.");
    }
}
