import java.util.Scanner;
public class Makespiralmatrix {

    static void printmatrix(int arry[][]) {
        for (int i = 0; i < arry.length; i++) {
            for (int j = 0; j < arry[i].length; j++) {
                System.out.print(arry[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static int [][] spiral(int arry[][], int rows, int columns) {
        int totalelement = 1;
        int top = 0, botm = rows - 1, left = 0, right = columns - 1;

        while (totalelement <= rows * columns) {
            // left to right;
            for (int i = left; i <= right && totalelement <= rows * columns; i++) {
                arry[top][i] = totalelement;
                totalelement++;
            }
            top++;
            // top to botum
            for (int i = top; i <= botm && totalelement <= rows * columns; i++) {
                arry[i][right] = totalelement;
                totalelement++;
            }
            right--;

            // right to left
            for (int i = right; i >= left && totalelement <= rows * columns; i--) {
                arry[botm][i] = totalelement;
                totalelement++;
            }
            botm--;
            // botum to top
            for (int i = botm; i >= top && totalelement <= rows * columns; i--) {
                arry[i][left] = totalelement;
                totalelement++;
            }
            left++;
        }
        return arry;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns: ");
        int rows = in.nextInt();
        int columns = in.nextInt();
        int arry[][] = new int[rows][columns];
        int ans [][] = spiral(arry, rows, columns);
        printmatrix(ans);
        in.close();

    }
}
