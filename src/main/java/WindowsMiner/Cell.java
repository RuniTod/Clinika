package WindowsMiner;

/***
 * Описание поведения ячейки
 */
public interface Cell<T> {

    boolean isBomb();
    boolean isShugestBomb();
    boolean isShugestEmpty();

    void shugestBomb();
    void shugestEmpty();

    void draw(T paint, boolean real);

}
