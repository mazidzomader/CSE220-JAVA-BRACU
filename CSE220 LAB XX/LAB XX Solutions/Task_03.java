public class Task_03 {
    public static int houseOfCards(int height) {
        if (height == 0) {
            return 0;
        }
        if (height == 1) {
            return 8;
        } else {
            return 5 + houseOfCards(height - 1);
        }
    }
    public static int gameOfCards(int num) {
        if (num == 1) {
            return 0;
        } else if (num % 2 == 0) {
            return 1 + gameOfCards(num / 2);
        } else {
            return 1 + gameOfCards(num * 3 + 1);
        }
    }
}
