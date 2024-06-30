package org.example;

import org.example.factories.GuiFactory;
import org.example.factories.MacOSFactory;
import org.example.factories.WindowsFactory;

import java.util.Locale;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static Application configureApplication(){
        Application app;
        GuiFactory factory = null;
        String osName=System.getProperty("os.name").toLowerCase(Locale.ROOT);
        if(osName.equals("mac")){
            factory=new MacOSFactory();
        }else{
            factory=new WindowsFactory();
        }
        assert factory != null;
        app=new Application(factory);
        return app;

    }
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        Application app=configureApplication();
        app.paint();
    }
}