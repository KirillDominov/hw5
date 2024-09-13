import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача № 1");
        int[] a = new int[3];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
        System.out.println();
        double[] c = {1.57, 7.654, 9.986};
        System.out.println(c[0]);
        System.out.println(c[1]);
        System.out.println(c[2]);
        System.out.println();
        int[] d = {12, 1415, 1867, 100};
        System.out.println(d[0]);
        System.out.println(d[1]);
        System.out.println(d[2]);
        System.out.println(d[3]);
        System.out.println();
        System.out.println("Задача № 2");
        System.out.print(Arrays.toString(a));
        System.out.println();
        System.out.print(Arrays.toString(c));
        System.out.println();
        System.out.print(Arrays.toString(d));
        System.out.println();
        System.out.println("Задача № 3");
        for (int index = 2; index < a.length; index--) {
            if (index == 0) {
                System.out.println(a[index]);
                break;
            }
            System.out.print(a[index] + ", ");
        }
        for (int index = 2; index < c.length; index--) {
            if (index == 0) {
                System.out.println(c[index]);
                break;
            }
            System.out.print(c[index] + ",");
        }
        for (int index = 3; index < d.length; index--) {
            if (index == 0) {
                System.out.println(d[index]);
                break;
            }
            System.out.print(d[index] + ", ");
        }
        System.out.println();
        System.out.println("Задача № 4");
        for (int index = 0; index < a.length; index++) {
            if (a[index] % 2 != 0) {
                a[index] = a[index] + 1;
            }
        }
        System.out.print(Arrays.toString(a));
    }
}