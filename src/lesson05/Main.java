package lesson05;

public class Main {

    public static void main(String[] args) {
        int[][] ints = new int[5][];
        ints[0] = new int[2];
        ints[1] = new int[12];
        ints[2] = new int[5];
        ints[3] = new int[7];
        ints[4] = new int[0];
        ints[3][4] = 3;

        int[][] intsArr = new int[5][7];
        intsArr[2] = new int[3];




        int[][] a = new int[3][];
        a[0] = new int[2];
        a[1] = new int[4];
        a[2] = new int[3];

        int[][] a2 = {{0, 0}, {0, 0, 0, 0}, {0, 0, 0}};
        int[][] a3 = {{0, 0}, {0, 0, 0, 0}, new int[3]};
        a3[2][2] = 1;

        int[][] arr = {{1, 2, 3}, {4, 5, 6, 7}, {7, 8, 9, 10, 11, 12, 13}, {20, 21}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        int[][][][][][][][][][][][][][] x = new int[5][6][7][9][5][5][5][5][5][5][5][5][5][5];
        x[0][0][0][0][0][0][0][0][0][0][0][0][0][0] = 0;
    }
}
