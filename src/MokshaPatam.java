
import java.util.LinkedList;
import java.util.Queue;

/**
 * Moksha Patam
 * A puzzle created by Zach Blick
 * for Adventures in Algorithms
 * at Menlo School in Atherton, CA
 * <p>
 * Completed by: [YOUR NAME HERE]
 */

public class MokshaPatam {

    /**
     * TODO: Complete this function, fewestMoves(), to return the minimum number of moves
     *  to reach the final square on a board with the given size, ladders, and snakes.
     */
    public static int fewestMoves(int boardsize, int[][] ladders, int[][] snakes) {


        Cell[] board = new Cell[boardsize + 1];
        initialize(board, ladders, snakes);
        Queue<Cell> movelist = new LinkedList<>();

        movelist.add(board[1]);

        while (movelist.peek() != null) {
            Cell current = movelist.remove();

            for (int i = 1; i <= 6; i++) {

                if (board[current.getVal() + i].getVal() >= boardsize) {
                    return current.getMove() + 1;
                }
                Cell diceRoll = board[current.getVal() + i];
                if (!diceRoll.isExplored()) {
                    diceRoll.setExplored(true);
                    diceRoll.setMove(current.getMove() + 1);
                    movelist.add(board[current.getVal() + i ]);
                }
            }
        }

        return -1;
    }

    public static void initialize(Cell[] board, int[][] ladders, int[][] snakes) {
        for (int i = 1; i < board.length; i++) {
            board[i] = new Cell(i);
        }
      //  board[board.length - 1] = new Cell(board.length - 1);

        for (int i = 0; i < ladders.length; i++) {
            board[ladders[i][0]] = board[ladders[i][1]];
        }
        for (int i = 0; i < snakes.length; i++) {
            board[snakes[i][0]] = board[snakes[i][1]];
        }


       }


}
