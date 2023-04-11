import java.util.Scanner;

public class Main
{
    private static final Scanner inScanner = new Scanner(System.in);

    public static void main(String[] args)
    {
        int size = getNumber("Введите размер массива: ");

        int[] arr = new int[size];

        System.out.println("\nЗаполнение массива.");
        for(int i = 0; i < size; i++) {
            arr[i] = getNumber("Введите число: ");
        }

        int k = 0;
        int l = 0;
        while(k <= 1 || k > l || l > size) {
            k = getNumber("Введите первый индекс, после которого не надо считать числа (> 1 && <= второй индекс)");
            l = getNumber("Введите второй индекс, до которого не надо считать числа (>= первый индекс && <= size)");
        }

        int average = 0;
        for(int i : arr) {
            if(i >= k && i <= l) continue;
            average += i;
        }

        System.out.println("Среднее арифметическое: " + (average / (size - (l - k))));
    }

    public static int getNumber(String msg) {
        System.out.println(msg);

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