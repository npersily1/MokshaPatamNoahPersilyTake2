import java.util.ArrayList;
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


        Cell[] board = new Cell[boardsize];
        initialize(board, ladders, snakes);
        Queue<Cell> movelist = new LinkedList<Cell>();

        movelist.add(board[0]);
        while (movelist.peek().getVal() != boardsize) {











        }



        return 0;
    }

    public static void initialize(Cell[] board, int[][] ladders, int[][] snakes) {
        for (int i = 0; i < board.length; i++) {
            board[i] = new Cell(i);
        }
        for (int i = 0; i < ladders.length; i++) {
            board[ladders[i][0]].setLadder(board[ladders[i][1]]);
        }
        for (int i = 0; i < snakes.length; i++) {
            board[snakes[i][1]].setSnake(board[snakes[i][0]]);
        }


    }


}
