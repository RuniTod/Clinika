package WindowsMiner;

public interface Logic {

    /***
     * Отрисовка поля
     * @param cell - массив ячеек
     */
    void loadBoard(Cell[][] cell);

    void shouldBang(int x, int y);

    boolean finish();

    void suggest(int x, int y ,boolean isBomb);

}
