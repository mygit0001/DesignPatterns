package org.example.square;

public class SquarePeg {
    private double width;

    public SquarePeg(double width){
        this.width=width;
    }

    public double getWidth(){
        return this.width;
    }

    public double getSquare(double width){
        return Math.pow(this.width,2);
    }
}
