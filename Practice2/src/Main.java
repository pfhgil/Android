import java.util.Scanner;

public class Main
{
    public static final Scanner inScanner = new Scanner(System.in);
    public static void main(String[] args)
    {
        int x = getNumber();
        int n = getNumber();

        if(n <= 0) {
            System.out.println("Второе введенное число должно быть больше 0!");
            return;
        }

        int res = 0;
        int originalX = x;

        for(int i = 1; i <= n; i++) {
            res += (Math.pow(-1, i) * Math.pow(x, (2 * i + 1))) / (getFractal(2 * i + 1));
        }

        originalX -= res;

        System.out.println("Результат: " + originalX);
    }

    private static int getFractal(int n)
    {
        int res = 1;
        for(int i = 1; i <= n; i++) {
            res *= i;
        }

        return res;
    }

    public static int getNumber() {
        System.out.println("Введите число: ");

        String numStr;
        boolean[] parsed = new boolean[1];
        int numInt = 0;

        while(!parsed[0]) {
            numStr = inScanner.next();
            numInt = tryParseInt(numStr, parsed);

            if(!parsed[0]) {
                System.out.println("Вы ввели не число!");
            }
        }

        return numInt;
    }

    public static int tryParseInt(String s, boolean[] boolRes) {
        int val = 0;
        try {
            val = Integer.parseInt(s);
            boolRes[0] = true;
        } catch(NumberFormatException e) {
            boolRes[0] = false;
        }

        return val;
    }
}