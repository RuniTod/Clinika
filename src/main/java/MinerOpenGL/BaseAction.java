package MinerOpenGL;

public class BaseAction implements UserAction {
    private final GenerateBoard generateBoard;
    private final Board board;
    private final SaperLogic logic;

    public BaseAction(GenerateBoard generateBoard, Board board, SaperLogic logic) {
        this.generateBoard = generateBoard;
        this.board = board;
        this.logic = logic;
    }


    @Override
    public void startGame() {
        final Cell[][] cells = generateBoard.generate();
        this.board.drawCells(cells);
        this.logic.loadBoard(cells);
    }

    @Override
    public void select(int x, int y, boolean isbomb) {
        this.logic.shuggestUser(x,y,isbomb);
        board.drawCell(x,y);
        if (this.logic.shouldBang(x,y)){
            board.drawDetonation();
        }
        if (this.logic.finish()){
            board.drawWin();
        }
    }
}
