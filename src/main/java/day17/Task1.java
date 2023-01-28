package day17;

public class Task1 {
    public static void main(String[] args) {

        ChessPiece[] figures =  {ChessPiece.PAWN_BLACK, ChessPiece.PAWN_BLACK, ChessPiece.PAWN_BLACK, ChessPiece.PAWN_BLACK,
                ChessPiece.ROOK_BLACK, ChessPiece.ROOK_BLACK, ChessPiece.ROOK_BLACK, ChessPiece.ROOK_BLACK};

        for (ChessPiece item: figures)
            System.out.print(item);

    }
}