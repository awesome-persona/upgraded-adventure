package lesson05;

public class MainWork2 {

    public static void main(String[] args) {
        // Найти сумму элементов столбцов матрицы (двумерного массива).
        int n =0;
        int[][] arr = {
                {33, 44, 77},
                {13, 38, 1},
                {-5, 7, 9, 11, 44,2},
                {0, -7, 16}
        };
        for (int i = 0; i < arr.length; i++) {
            if(n< arr[i].length){
                n = arr[i].length;
            }
        }
        System.out.println(n);
        int[] arrr = new int[n];
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arrr[j] += arr[i][j];
            }
        }
        for (int i = 0; i < arrr.length; i++) {
            System.out.print(arrr[i] + " ");

        }
    }
}
