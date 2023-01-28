package day17;

public class ChessBoard {

    private ChessPiece[][] match;
    public ChessBoard(ChessPiece[][] match) {
        this.match = match;
    }

    public void print(){
        for (int i = 0; i < match.length; i++) {
            for (int j = 0; j < match.length; j++)
                System.out.print(match[i][j]);

            System.out.println();
        }
    }
}
