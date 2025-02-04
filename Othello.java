package othello.game;

/**
 * Capture an Othello game. This includes an OthelloBoard as well as knowledge
 * of how many moves have been made, whosTurn is next (OthelloBoard.P1 or
 * OthelloBoard.P2). It knows how to make a move using the board and can tell
 * you statistics about the game, such as how many tokens P1 has and how many
 * tokens P2 has. It knows who the winner of the game is, and when the game is
 * over.
 *
 */
public class Othello {
    public static final int DIMENSION = 8;
    private char whosTurn = OthelloBoard.P1;
    private int numMoves = 0;
    private OthelloBoard board;

    /**
     * Initialize a new Othello class.
     */
    public Othello() {
        this.board = new OthelloBoard(DIMENSION);
    }

    /**
     * return P1,P2 or EMPTY depending on who moves next.
     *
     * @return P1, P2 or EMPTY
     */
    public char getWhosTurn() {
        return whosTurn;
    }

    /**
     * Attempt to make a move for P1 or P2 (depending on whos turn it is) at
     * position row, col. A side effect of this method is modification of whos turn
     * and the move count.
     *
     * @param row
     * @param col
     * @return whether the move was successfully made.
     */
    public boolean move(int row, int col) {
        boolean moved = false;
        // If a successful move has been made
        if (board.move(row, col, whosTurn)) {
            numMoves += 1;
            moved = true;
        }

        // Only change the move if both players have moves, or if the other
        // player (whose turn it isn't right now) has a turn
        if (board.hasMove() == OthelloBoard.BOTH ||
                board.hasMove() == OthelloBoard.otherPlayer(whosTurn)) {
            whosTurn = OthelloBoard.otherPlayer(whosTurn);
        } else if (board.hasMove() == OthelloBoard.EMPTY) {
            return true; // game is over
        }
        return moved;
    }

    /**
     * @param player P1 or P2
     * @return the number of tokens for player on the board
     */
    public int getCount(char player) {
        return board.getCount(player);
    }

    /**
     * @return current Othello board
     */
    public OthelloBoard getBoard() {
        return board;
    }

    /**
     * Returns the winner of the game.
     *
     * @return P1, P2 or EMPTY for no winner, or the game is not finished.
     */
    public char getWinner() {
        if (isGameOver()) {
            if (board.getCount(OthelloBoard.P1) > board.getCount(OthelloBoard.P2)) {
                return OthelloBoard.P1;
            } else if (board.getCount(OthelloBoard.P2) > board.getCount(OthelloBoard.P1)) {
                return OthelloBoard.P2;
            }
        }
        return OthelloBoard.EMPTY;
    }

    /**
     * @return whether the game is over (no player can move next)
     */
    public boolean isGameOver() {
        return board.hasMove() == OthelloBoard.EMPTY;
    }

    /**
     * @return a string representation of the board.
     */
    public String getBoardString() {
        return board.toString();
    }
}
