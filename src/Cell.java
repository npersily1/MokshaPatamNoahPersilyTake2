public class Cell {


    private int val, move;
    private boolean isExplored;
    private Cell snake,ladder;

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

    public Cell getSnake() {
        return snake;
    }

    public void setSnake(Cell snake) {
        this.snake = snake;
    }

    public Cell getLadder() {
        return ladder;
    }

    public void setLadder(Cell ladder) {
        this.ladder = ladder;
    }
}
