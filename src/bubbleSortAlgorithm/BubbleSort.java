package bubbleSortAlgorithm;

public class BubbleSort {

    public static int[] arr;

    public BubbleSort() {

        arr = new int[]{3, 60, 35, 2, 45, 320, 5};

    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length, temp;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1] > arr[j]) {

                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;

                }
            }
        }

    }

    public static void before() {
        System.out.println("Array Before Bubble Sort");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void after() {
        bubbleSort(arr);

        System.out.println("Array after Bubble Sort");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.println();

    }

    public static void main(String[] args) {

        BubbleSort b = new BubbleSort();

        BubbleSort.before();
        System.out.println();
        BubbleSort.after();

    }

}
