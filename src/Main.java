import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        for (;;) {
            // При старте, приложение предлагает начать новую игру или выйти из приложения
            Scanner console = new Scanner(System.in);
//            System.out.print("нажміте 1 якщо хочете почати нову гру  або 0 якщо хочете вийти: ");
//            int answer = console.nextInt();
//            if (answer == 0) {
//                return;
//            }

            //  2. При начале новой игры, случайным образом загадывается слово, и игрок начинает процесс по его отгадыванию
            //  створити массив слів і брати случайно одне з них
            String[] words = new String[]{"winter", "spring", "summer", "autumn"};

            Random r = new Random();
            int low = 0;
            int high = words.length;
            int index = r.nextInt(high-low) + low;
            String secret = words[index];
            String guess = "";

            System.out.println(secret);

            // TODO: 3. После каждой введенной буквы выводим в консоль счётчик ошибок, текущее состояние виселицы (нарисованное ASCII символами)
            //  цикл грі з виводом слова и вішалки
        int errors = 0;

        while (errors < 6) {
            printword(secret, guess);

            System.out.println("\nerrors " + errors);
            System.out.print("\nведіте букву: ");
            String letter = console.next();

            if (!secret.contains(letter)) {
                errors++;
                continue;
            }

            guess += letter;

//            errors++;
        }


        // TODO: 4. По завершении игры выводим результат (победа или поражение) и возвращаемся к состоянию #1 - предложение начать новую игру или выйти из приложения
//        }
    }

    private static void printword(String secret, String guess) {
        for (int i = 0; i < secret.length(); i++) {

            System.out.print("_ ");
//            if (guess.contains(String.valueOf(secret.charAt(i)))) {
//                System.out.print(secret.charAt(i) + " ");
//            } else {
//                System.out.print("_ ");
//            }
        }
    }
}
