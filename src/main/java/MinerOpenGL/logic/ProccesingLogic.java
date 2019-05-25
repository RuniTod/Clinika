package MinerOpenGL.logic;

import MinerOpenGL.Cell;
import MinerOpenGL.SaperLogic;

public class ProccesingLogic implements SaperLogic {
    private Cell[][] cells;


    @Override
    public void loadBoard(Cell[][] cells) {
        this.cells = cells;
    }

    @Override
    public boolean shouldBang(int x, int y) {
        final Cell cell = this.cells[x][y];
        return cell.isBomb() && !cell.isChooseUserBomb();
    }

    @Override
    public boolean finish() {
        boolean finish = false;
        for (Cell[] i: cells){
            for (Cell j:i){
                finish = ((j.isChooseUserBomb() && j.isBomb()) || (j.isChooseUserEmpty() && !j.isBomb()));
            }
        }
        return finish;
    }

    @Override
    public void shuggestUser(int x, int y, boolean isbomb) {
        if (isbomb){
            this.cells[x][y].isChooseUserBomb();
        } else {
            this.cells[x][y].isChooseUserEmpty();
        }
    }
}
