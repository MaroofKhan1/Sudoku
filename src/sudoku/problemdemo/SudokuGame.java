public class SudokuGame {
    private final GameState ˆ;
    private final int[][] gridState;

    public static final GRID_BOUNDRY = 9;

    public SudokuGame (GameState gameState, int[][] gridState) {
        this.gameState = gameState;
        this.gridState = gridState;
    }

    public GameState getGameState() {
        return gameState;
    }

    public int[][] gameGridState() {
        return gridState;
    }
}
