package lesson03;

public class MainEx {

    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            int m = 0;
            m = i * 5;
            System.out.println("5 * " + i + " = " + m);

        }

        int z = 3;
        for (int i = 0; i < 15; i++) {
            System.out.print(z + " ");
            z *= 3;
        }
        System.out.println();

        int n = 9, m = 7;

        for (int j = 0; j < m; j++)
        {
            System.out.println();
            for (int i = 0; i < n; i++)
            {
                System.out.print("* ");
            }
        }


        for (int j = 0; j < n; j++)
        {
            System.out.println();
            for (int i = 0; i <= j; i++)
            {
                System.out.print("* ");
            }
        }

        System.out.println();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-1-i;j++) {
                System.out.print(" ");
            }
            for(int g=0;g<2*i+1;g++)
            {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
