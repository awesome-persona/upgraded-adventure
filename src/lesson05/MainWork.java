package lesson05;

import javax.imageio.metadata.IIOMetadataFormatImpl;
import java.sql.SQLOutput;
import java.util.Arrays;

public class MainWork {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 4};
        int a = 0;
        int b = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                a++;
            }
            if (arr[i] < 0) {
                b++;
            }
        }
        System.out.println("Длина массива a " + a);
        System.out.println("Длина массива b " + b);

        int[] arrNegative = new int[b];
        int[] arrPositive = new int[a];

        for (int i = 0, j=0, k=0; i < arr.length; i++) {
            if (arr[i] > 0) {
                arrPositive[j] = arr[i];
                j++;

            }
            if (arr[i] < 0) {
                arrNegative[k] = arr[i];
                k++;
            }
        }
        System.out.println(Arrays.toString(arrPositive));
        System.out.println(Arrays.toString(arrNegative));
    }
}
