import java.util.ArrayList;

/**
 * Moksha Patam
 * A puzzle created by Zach Blick
 * for Adventures in Algorithms
 * at Menlo School in Atherton, CA
 *
 * Completed by: [YOUR NAME HERE]
 *
 */

public class MokshaPatam {

    /**
     * TODO: Complete this function, fewestMoves(), to return the minimum number of moves
     *  to reach the final square on a board with the given size, ladders, and snakes.
     */
    public static int fewestMoves(int boardsize, int[][] ladders, int[][] snakes) {

           int count = ladderDifference(ladders);
        ArrayList<int[]> ladderList = new ArrayList<int[]>();
        return 0;
    }
    public static void lowerBound(int[][]ladders, ArrayList<int[]> a, int upperBound) {



    }
    // Returns index of ladder with the biggest difference
    public static int ladderDifference(int[][] ladders) {
        int greatestDiff = 0;
        int count = 0;
        for (int i = 0; i < ladders.length;i++) {
            if (greatestDiff < ladders[i][1] - ladders[i][0]) {
                greatestDiff = ladders[i][1] - ladders[i][0];
                count = i;
            }
        }
        return count;
    }
    // add a method that checks if a ladder is in bounds. (useful for recursion)

}
