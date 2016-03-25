package main.java.CuttingObjects;

import java.util.ArrayList;

/**
 * Created by alexa on 23-Mar-16.
 */
public class BoardContainer {

    private Board board;
    private ArrayList<Piece> pieces;

    public BoardContainer(Board board, ArrayList<Piece> pieces)
    {
        this.board = board;
        this.pieces = pieces;
    }
}
