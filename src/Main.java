import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int att = 0;
        do {
            int number_random = get_number_random(10);
            System.out.println(number_random);
            guess_number(number_random);
            att = let_play_again();
        } while (att == 1);
    }

    /**
     * Загадываем случайное число от 0 до 9
     */
    static int get_number_random(int var) {
        int number = (int) (Math.random() * var);
        return number;
    }

    /**
     * Угадывание числа в 3 попытки
     */
    static void guess_number(int number_random) {
        int win = 0;
        for (int i = 1; i < 4; i++) {
            System.out.println("Угадайте число от 0 до 9");
            System.out.printf("%d попытка из 3 ", i);
            Scanner num = new Scanner(System.in);
            int number = num.nextInt();
            if (number == number_random) {
                win = 1;
                System.out.println("Поздравляю!!! Вы угадали!!!");
                break;
            }
            if (number < number_random) {
                System.out.println("Загаданное число больше!");
            } else {
                System.out.println("Загаданное число меньше!");
            }
        }
    }

    /**
     * Запрос на новый тур
     */
    static int let_play_again() {
        System.out.printf("Повторить игру еще раз?\n1 – да / 0 – нет ");
        Scanner v = new Scanner(System.in);
        int var = v.nextInt();
        while (var != 0 && var !=1) {
            System.out.println("Неверный выбор!!!");
            System.out.printf("Повторить игру еще раз?\n1 – да / 0 – нет ");
            var = v.nextInt();
        }
        if (var == 1) {
            System.out.println("Отлично! Давай сыграем заново!");
        } else if (var == 0) {
            System.out.println("До новых встреч!");
        }
        return var;
    }
}
