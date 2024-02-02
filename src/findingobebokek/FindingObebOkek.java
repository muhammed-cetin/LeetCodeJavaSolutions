package findingobebokek;

import java.util.Scanner;

public class FindingObebOkek {
    static int findObeb(int number1, int number2) {
        while (number2 != 0) {
            int temp = number2;
            number2 = number1 % number2;
            number1 = temp;
        }
        return number1;
    }

    static int findOkek(int number1, int number2) {
        return (number1 * number2) / findObeb(number1, number2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter the first number: ");
        int number1 = scanner.nextInt();

        System.out.print("enter the second number: ");
        int number2 = scanner.nextInt();

        if (number1 < number2) {
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }

        int obeb = findObeb(number1, number2);
        int okek = findOkek(number1, number2);

        System.out.println("OBEB: " + obeb);
        System.out.println("OKEK: " + okek);

        scanner.close();
    }
}
