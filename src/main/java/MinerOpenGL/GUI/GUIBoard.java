package MinerOpenGL.GUI;

import Human.Pacient;
import MinerOpenGL.Board;
import MinerOpenGL.Cell;

import javax.swing.*;
import java.awt.*;

public class GUIBoard extends JPanel implements Board {

    public static final int PADDING = 50;

    public Cell<Graphics>[][] cells;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (cells != null){
            for (int x =0;x<cells.length;x++){
                for(int y =0; y <cells[0].length;y++){
                    g.setColor(Color.blue);
                    cells[x][y].draw(g,false);
                    g.drawOval(x*PADDING,y*PADDING,PADDING, PADDING);
                }
            }
        }
    }

    @Override
    public void drawCells(Cell[][] cells) {
        this.cells = cells;
        this.repaint();
    }

    @Override
    public void drawCell(int x, int y) {
        this.repaint();
    }

    @Override
    public void drawDetonation() {
        this.repaint();

    }

    @Override
    public void drawWin() {

    }
}
