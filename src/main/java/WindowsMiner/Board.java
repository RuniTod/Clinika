package WindowsMiner;


/***
 * Описывает поведение доски
 */
public interface Board {

    /***
     * Метод для отрисовки доски
     */
     void drawingBoard(Cell[][] cell);

    /***
     * Метод для отримсоки ячейки
     * @param x - позиция по горизонтали
     * @param y - позиция по вертикали
     */
    void drawingCel(int x,int y);

    /***
     * Метод при поражении
     */
     void drawingBang();

    /***
     * Метод при выигрыше
     */
    void drawingWin();




}
