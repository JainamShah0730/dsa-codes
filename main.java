package jainamproject;
import java.util.Scanner;

public class main {

    static void selectionSort(int[] array, int n) {
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            // swap
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = s.nextInt();
        }

        selectionSort(array, n);

        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }

        s.close();
    }
}
