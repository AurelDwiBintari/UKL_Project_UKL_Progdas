import java.util.Random;
import java.util.Scanner;

public class quizmath {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        String[] operators = { "*", "/", "%", "+", "-" };

        while (true) {
            int num1 = r.nextInt(10) + 1; // Angka 1-10
            int num2 = r.nextInt(10) + 1; // Angka 1-10
            String operator = operators[r.nextInt(operators.length)];

            System.out.print(num1 + " " + operator + " " + num2 + " = ");
            String input = s.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Terima kasih telah bermain!");
                break;
            }

            int correctAnswer = 0;
            if (operator.equals("*")) {
                correctAnswer = num1 * num2;
            } else if (operator.equals("/")) {
                correctAnswer = num1 / num2;
            } else if (operator.equals("%")) {
                correctAnswer = num1 % num2;
            } else if (operator.equals("+")) {
                correctAnswer = num1 + num2;
            } else if (operator.equals("-")) {
                correctAnswer = num1 - num2;
            }

            try {
                int userAnswer = Integer.parseInt(input);
                if (userAnswer == correctAnswer) {
                    System.out.println("Benar!");
                } else {
                    System.out.println("Salah! Jawaban yang benar adalah: " + correctAnswer);
                }
            } catch (NumberFormatException e) {
                System.out.println("Masukkan angka yang valid!");
            }
        }
    }
}
