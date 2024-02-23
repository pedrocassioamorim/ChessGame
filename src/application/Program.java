package application;

import Boardgame.Board;
import Boardgame.Position;
import Chess.ChessMatch;

public class Program {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        ChessMatch chessMatch = new ChessMatch();
        UI.printBoard(chessMatch.getPieces());



    }
}