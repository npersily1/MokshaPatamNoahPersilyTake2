
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

        // Create and store values in the board
        Cell[] board = new Cell[boardsize + 1];
        initialize(board, ladders, snakes);

        // Create a way to store moves for BFS
        Queue<Cell> movelist = new LinkedList<>();

        // Add the first cell
        movelist.add(board[1]);

        // While there are still moves left
        while (movelist.peek() != null) {

            // Remove the most recent move
            Cell current = movelist.remove();

            // For every possible dice roll
            for (int i = 1; i <= 6; i++) {
                // If you are at the last square
                if (board[current.getVal() + i].getVal() == boardsize) {
                    // Return how many moves it took to get to the current square plus one for the roll to the end
                    return current.getMove() + 1;
                }
                // diceRoll represents the cell you are thinking of going too
                Cell diceRoll = board[current.getVal() + i];
                // If it hasn't been explored
                if (!diceRoll.isExplored()) {
                    // Explore it, add how many moves it took, and add it to the movelist
                    diceRoll.setExplored(true);
                    diceRoll.setMove(current.getMove() + 1);
                    movelist.add(board[current.getVal() + i]);
                }
            }
        }
        // If unwinnable return negative 1
        return -1;
    }

    public static void initialize(Cell[] board, int[][] ladders, int[][] snakes) {
        // For each cell in the board create a new cell with corresponding value without considering snakes or ladders
        for (int i = 1; i < board.length; i++) {
            board[i] = new Cell(i);
        }
        // For every ladder set the index of the start to the memory location of the end one
        for (int i = 0; i < ladders.length; i++) {
            board[ladders[i][0]] = board[ladders[i][1]];
        }
        // Same but reversed for snakes
        for (int i = 0; i < snakes.length; i++) {
            board[snakes[i][0]] = board[snakes[i][1]];
        }


    }


}
