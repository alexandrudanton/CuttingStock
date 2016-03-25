package main.java.CuttingObjects;

import java.util.HashMap;

/**
 * Created by alexa on 23-Mar-16.
 */
public class Board extends WoodPiece {

    public Board(int length, int width)
    {
        super(length, width);
    }

    @Override
    public String toString() {
        return "Board{" +
                "dimensions=" + dimensions +
                '}';
    }
}
