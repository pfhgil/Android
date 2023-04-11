import java.util.Scanner;

public class SecondTask
{
    public static void main(String[] args)
    {
        int n = Main.getNumber();
        int k = Main.getNumber();

        System.out.println("Частное чисел " + n + " и " + k + ": " + getQuotient(n, k) + ", остаток: " + getRemainder(n, k));
    }

    // нахождение частного
    private static int getQuotient(int n, int k)
    {
        int quotient = 0;
        while(n - k >= 0) {
            quotient++;
            n -= k;
        }

        return quotient;
    }

    private static int getRemainder(int n, int k)
    {
        while(n - k >= 0) {
            n -= k;
        }

        return n;
    }
}
