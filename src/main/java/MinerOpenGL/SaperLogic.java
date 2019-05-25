package MinerOpenGL;

public interface SaperLogic {

    void loadBoard(Cell[][] cells);

    boolean shouldBang(int x, int y);

    boolean finish();

    void shuggestUser(int x,int y,boolean isbomb);

}
