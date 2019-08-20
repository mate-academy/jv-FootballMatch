package core.basesyntax;

public class FootballMatch {

    /**
     * С помощью тернарного оператора написать функцию, которая будет считать исход матча.
     * Метод будет принимать 4 параметра и возвращать целое число.
     * 4 параметра метода - результат матча и то, какую ставку сделал пользователь.
     *
     * Пример: 0,2,1,1. Что значит: команды сыграли в счёт 0:2, а пользователь ставил 1:1.
     *
     * Задача:
     *         если пользователь угадал 100% результат - возвращать 2
     *         если угадал, что выиграла какая-либо команда
     *             (пр. сыграли 1:2, а ставил 0:3 - то пользователь у выиграше)
     *             то возвращать 1
     *         если не угадал ничего - возвращать 0.
     */
    public int matchResult(int result1, int result2, int bet1, int bet2) {
        int realResult1 = 1;
        int realResult2 = 2;
        boolean resultAllGuessed = (realResult1 == result1) && (realResult2 == result2);
        boolean resultWhoWinGuessed = ((realResult1 > realResult2) && (result1 > result2)) ||
                ((realResult1 > realResult2) && (result1 > result2));
        int resultIfWin = resultWhoWinGuessed ? bet1 : 0;
        return resultAllGuessed ? bet1 + bet2 : resultIfWin;
    }
}
