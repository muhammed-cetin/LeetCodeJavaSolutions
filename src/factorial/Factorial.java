package factorial;

import java.util.Scanner;

public class Factorial {

    static long factorial(int num) {
        if (num <= 1)
            return 1;
        else
            return num * factorial(num - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a value!!");
        int result  = scanner.nextInt();
        System.out.println(result + " in factorial : " + factorial(result));
    }
}
