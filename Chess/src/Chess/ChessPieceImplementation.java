package Chess;

import static Chess.ChessMovementManager.getAvailablePositionsOfBishop;
import static Chess.ChessMovementManager.getAvailablePositionsOfKing;
import static Chess.ChessMovementManager.getAvailablePositionsOfKnight;
import static Chess.ChessMovementManager.getAvailablePositionsOfPawn;
import static Chess.ChessMovementManager.getAvailablePositionsOfQueen;
import static Chess.ChessMovementManager.getAvailablePositionsOfRook;

public class ChessPieceImplementation implements ChessPiece {

    boolean piezaMovida = false;
    Color ColorPieza ;
    Type tipoPieza ;

    ChessPieceImplementation(Color color, Type type) {
        ColorPieza=color;
        tipoPieza=type;
    }
    
    @Override
    public Color getColor() {
        return ColorPieza;
    }

    @Override
    public Type getType() {
        return tipoPieza;
    }

    @Override
    public void notifyMoved() {
        piezaMovida=true;
    }

    @Override
    public boolean wasMoved() {
        return piezaMovida;
    }

    @Override
    public PiecePosition[] getAvailablePositions(ChessBoard aBoard) {
        switch (tipoPieza)
        {
            case KING:
                return getAvailablePositionsOfKing(this,aBoard);
            
            case QUEEN:
                return getAvailablePositionsOfQueen(this,aBoard);
                    
            case ROOK:
               return getAvailablePositionsOfRook(this,aBoard);
                 
            case BISHOP:
                 return getAvailablePositionsOfBishop(this,aBoard);
                
            case KNIGHT:
                return getAvailablePositionsOfKnight(this,aBoard);
                
            case PAWN:
                return getAvailablePositionsOfPawn(this,aBoard);
                
        }
        return null;
    }
    
    
}