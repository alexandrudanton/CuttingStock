package main.java.CuttingObjects;

import java.util.HashMap;

/**
 * Created by alexa on 23-Mar-16.
 */
public class Piece extends WoodPiece {

    private int number;

    public Piece(int length, int width, int number)
    {
        super(length, width);
        this.number = number;
    }

    @Override
    public String toString()
    {
        return "Piece{" +
                "dimensions=" + dimensions +
                ", number=" + number +
                '}';
    }
}
