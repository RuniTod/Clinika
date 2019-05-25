package MinerOpenGL;

public interface Cell<T> {

    boolean isBomb();

    boolean isEmty();

    boolean isChooseUserBomb();

    boolean isChooseUserEmpty();

    void userBomb();
    void userEmpty();

    void draw(T paint,  boolean real);


}
