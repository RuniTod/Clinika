package MinerOpenGL.GUI;

import MinerOpenGL.BaseAction;
import MinerOpenGL.Board;
import MinerOpenGL.GenerateBoard;
import MinerOpenGL.SaperLogic;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class GUIAction extends BaseAction implements ActionListener, MouseListener {

    private GUIBoard board;

    public GUIAction( SaperLogic logic, GUIBoard board,GenerateBoard generateBoard) {
        super(generateBoard, board, logic);
        this.board = board;
        this.board.addMouseListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        this.startGame();

    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
