package WindowsMiner;

/***
 * Действие пользователя
 */
public interface UserAction {

    /***
     * Начало игры
     */
    void initGame();

    /***
     * Выбор ячейки
     */
    void select(int x,int y, boolean bomb);

}
