package main.java;

import main.java.CuttingObjects.Board;
import main.java.CuttingObjects.Piece;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class App {

    private Board board;
    private ArrayList<Piece> pieces;

    public static void main(String... args)
    {
        App app = new App();
        app.loadSettings("file/board_and_pieces_settings.txt");

        app.sortPiecesByLength();

        System.out.println(app.board);
        app.pieces.forEach(System.out::println);
    }

    private void sortPiecesByLength()
    {
        this.pieces.sort((p1, p2) -> Integer.compare(p2.getLength(), p1.getLength()));
    }

    private void loadSettings(String fileName)
    {
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource(fileName).getFile());

        try (Scanner scanner = new Scanner(file)) {

            this.board = new Board(scanner.nextInt(), scanner.nextInt());
            this.pieces = new ArrayList<>();

            while (scanner.hasNext()) {
                this.pieces.add(new Piece(scanner.nextInt(), scanner.nextInt(), scanner.nextInt()));
            }

            scanner.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
