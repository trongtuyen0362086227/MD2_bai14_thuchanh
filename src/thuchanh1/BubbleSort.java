package thuchanh1;

public class BubbleSort {
    static int[] arrInt = {1, 2, 6, 4, 7, 3, 8, 5, 9};

    public static void bubbleSort(int[] list) {
        boolean needNextPass = true;

        for (int k = 1; k < list.length && needNextPass; k++) {
            /* Array may be sorted and next pass not needed */
            needNextPass = false;
            for (int i = 0; i < list.length - k; i++) {
                if (list[i] > list[i + 1]) {
                    /* Swap list[i] with list[i + 1] */
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;

                    needNextPass = true; /* Next pass still needed */
                }
            }
        }
    }

    public static void main(String[] args) {
        bubbleSort(arrInt);
        for (int i = 0; i < arrInt.length; i++)
            System.out.print(arrInt[i] + " ");
    }
}

