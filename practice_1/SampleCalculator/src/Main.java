import java.util.Scanner;

public class Main {
    private final static Scanner inScanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Калькулятор.\nВот все возможные действия: +, -, *, /, ^.");
        while(true) {
            int num0 = getNumber();

            String sign = "";
            boolean equals = false;
            while(!equals) {
                System.out.println("Введите знак: ");
                sign = inScanner.next();

                equals = sign.equals("+") || sign.equals("-") || sign.equals("*") || sign.equals("/") || sign.equals("^");
                if(!equals) {
                    System.out.println("Введен неверный знак!");
                }
            }

            int num1 = getNumber();

            int res = switch(sign) {
                case "+" -> num0 + num1;
                case "-" -> num0 - num1;
                case "*" -> num0 * num1;
                case "/" -> num0 / num1;
                case "^" -> (int) Math.pow(num0, num1);
                default -> 0;
            };

            System.out.println("Получившийся результат: " + res);
        }
    }

    private static int getNumber() {
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

    private static int tryParseInt(String s, boolean[] boolRes) {
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