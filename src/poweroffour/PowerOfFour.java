package poweroffour;

public class PowerOfFour {
    static boolean isPowerOfFour(int n) {
        if (n < 1) {
            return false;
        } else {
            if (n == 1 || (n % 4 == 0))
                return true;
            return false;
        }
    }


    public static void main(String[] args) {
        System.out.println(isPowerOfFour(5));
    }
}
