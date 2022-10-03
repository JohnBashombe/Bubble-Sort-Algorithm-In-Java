package bubbleSortAlgorithm;

import java.util.Scanner;

public class BubbleSort2 {

    static int[] array;
    static int n;
    static Scanner scanner;

    public BubbleSort2() {
        scanner = new Scanner(System.in);

        System.out.println("Enter the number of Integers to Sort");

        n = scanner.nextInt();
        array = new int[n];
    }

    public static void initialize() {
        System.out.println("Enter " + n + " integers");

        for (int c = 0; c < n; c++) {
            array[c] = scanner.nextInt();
        }
    }

    public static void swap() {
        for (int c = 0; c < (n - 1); c++) {
            for (int d = 0; d < n - c - 1; d++) {

                if (array[d] > array[d + 1]) {
                    int swap = array[d];
                    array[d] = array[d + 1];
                    array[d + 1] = swap;
                }

            }
        }
    }

    public static void print() {
        System.out.println("Sorted list of numbers");

        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        BubbleSort2 b = new BubbleSort2();

        BubbleSort2.initialize();
        BubbleSort2.swap();
        BubbleSort2.print();

    }
}
