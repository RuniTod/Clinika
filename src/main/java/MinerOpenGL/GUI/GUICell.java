package MinerOpenGL.GUI;

import MinerOpenGL.Cell;

import java.awt.*;

public class GUICell implements Cell<Graphics> {
    @Override
    public boolean isBomb() {
        return false;
    }

    @Override
    public boolean isEmty() {
        return false;
    }

    @Override
    public boolean isChooseUserBomb() {
        return false;
    }

    @Override
    public boolean isChooseUserEmpty() {
        return false;
    }

    @Override
    public void userBomb() {

    }

    @Override
    public void userEmpty() {

    }

    @Override
    public void draw(Graphics paint, boolean real) {

    }
}
