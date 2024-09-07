public class Cell {


    private int val, move;
    private boolean isExplored;


    public Cell(int val) {
        this.val = val;
        isExplored = false;
    }
    // Getters and Setters

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public int getMove() {
        return move;
    }

    public void setMove(int move) {
        this.move = move;
    }


    public boolean isExplored() {
        return isExplored;
    }

    public void setExplored(boolean explored) {
        isExplored = explored;
    }
}