package org.example;

import org.example.editor.ImageEditor;
import org.example.shapes.Circle;
import org.example.shapes.CompoundShape;
import org.example.shapes.Dot;
import org.example.shapes.Rectangle;

import java.awt.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ImageEditor editor = new ImageEditor();

        editor.loadShapes(
                new Circle(10, 10, Color.BLUE,10),

                new CompoundShape(
                        new Circle(110, 110, Color.RED,50),
                        new Dot(160, 160, Color.RED)
                ),

                new CompoundShape(
                        new Rectangle(250, 250, 100, 100, Color.GREEN),
                        new Dot(240, 240, Color.GREEN),
                        new Dot(240, 360, Color.GREEN),
                        new Dot(360, 360, Color.GREEN),
                        new Dot(360, 240, Color.GREEN)
                )
        );
    }
}