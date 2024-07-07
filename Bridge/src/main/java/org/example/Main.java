package org.example;

import org.example.devices.Device;
import org.example.devices.Radio;
import org.example.devices.Tv;
import org.example.remotes.AdvancedRemote;
import org.example.remotes.BasicRemote;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        testDevice(new Tv());
        testDevice(new Radio());
    }

    public static void testDevice(Device device){
        System.out.println("_____________Testing device with basic remote");
        BasicRemote basicRemote=new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("_____________Testing device with advanced remote");
        AdvancedRemote advancedRemote=new AdvancedRemote(device);
//        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();


    }
}