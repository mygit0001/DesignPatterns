package org.example.adapters;

import org.example.round.RoundPeg;
import org.example.square.SquarePeg;

public class SquarePegAdapter extends RoundPeg {
    private SquarePeg squarePeg;
    public SquarePegAdapter(SquarePeg peg) {
        this.squarePeg=peg;
    }

    @Override
    public double getRadius(){
        double result;
        result=squarePeg.getWidth()/2;
        return result;
    }
}
