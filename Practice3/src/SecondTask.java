public class SecondTask
{
    public static void main(String[] args)
    {
        int m = 0;
        int n = 0;

        while(m <= 0 || n <= 0) {
            m = Main.getNumber("Введите первое число (> 0): ");
            n = Main.getNumber("Введите второе число (> 0): ");
        }

        int[] mArr = new int[m];
        for(int i = 0; i < m; i++) {
            mArr[i] = Main.getNumber("Введите число для массива: ");
        }

        int[][] matrix = new int[m][n];

        for(int i = 0; i < m; i++) {
            for(int k = 0; k < n; k++) {
                matrix[i][k] = mArr[i];
            }
        }

        for(int i = 0; i < m; i++) {
            for(int k = 0; k < n; k++) {
                System.out.print(matrix[i][k] + "\t");
            }
            System.out.println();
        }
    }
}
