package MinerOpenGL;

public interface Board {

    void drawCells(Cell[][] cells);

    void drawCell(int x, int y);

    void drawDetonation();

    void drawWin();

}
