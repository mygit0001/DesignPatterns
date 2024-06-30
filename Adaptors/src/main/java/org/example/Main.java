package org.example;

import org.example.adapters.SquarePegAdapter;
import org.example.round.RoundHole;
import org.example.round.RoundPeg;
import org.example.square.SquarePeg;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        RoundPeg roundPeg=new RoundPeg(5);
        RoundHole roundHole=new RoundHole(5);

        if(roundHole.fits(roundPeg))
            System.out.println("Round peg r5 fits round hole r5.");

        SquarePeg smallsqpeg=new SquarePeg(2);
        SquarePeg largesqpeg=new SquarePeg(20);

        SquarePegAdapter smallsqPegAdapter=new SquarePegAdapter(smallsqpeg);
        SquarePegAdapter largesqPegAdapter=new SquarePegAdapter(largesqpeg);

        if(roundHole.fits(smallsqPegAdapter))
            System.out.println("Square peg w2 fits round hole r5.");
        if(!roundHole.fits(largesqPegAdapter))
            System.out.println("Square peg w20 does not fit into round hole r5.");
    }
}