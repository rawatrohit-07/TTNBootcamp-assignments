public class Ques4 {
    public static void main(String[] args) {

        int[][] array = {
                {10, 20, 3},
                {41, 50, 6},
                {72, 88, 91}
        };

        int rows = array.length;
        int cols = array[0].length;

        int totalRowSum = 0;
        int totalColSum = 0;

        System.out.println("Sum of each row:");
        for (int i = 0; i < rows; i++) {
            int rowSum = 0;
            for (int j = 0; j < cols; j++) {
                rowSum += array[i][j];
            }
            totalRowSum += rowSum;
            System.out.println("Row " + (i + 1) + ": " + rowSum);
        }

        System.out.println("Sum of each column:");
        for (int j = 0; j < cols; j++) {
            int colSum = 0;
            for (int i = 0; i < rows; i++) {
                colSum += array[i][j];
            }
            totalColSum += colSum;
            System.out.println("Column " + (j + 1) + ": " + colSum);
        }

        System.out.println("Total Sum of each row : " + totalRowSum);
        System.out.println("Total Sum of each column : " + totalColSum);
    }
}
