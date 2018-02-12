
public class SorterContainer {
    public static void main(String args[]) {
        int[] arr = {8, 100, 27, -3, 4, 56, 32, 1, 67};
        dmytroBubbleSort(arr);
        valeraBubbleSort(arr);
        NikaBubbleSort(arr);
        AnkaBubbleSort(arr);
    }

    public static void dmytroBubbleSort(int[] array) {
        doBubbleSort(array);
    }

    private static void doBubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[j] < array[j - 1]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }
    }

    public static void valeraBubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = array.length - 1; j > i; j--) {
                int temp = 0;
                if (array[j] < array[j - 1]) {
                    temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }
    }

    public static void NikaBubbleSort(int[] mas) {
        for (int j = mas.length; j > 0; j--) {
            for (int i = 1; i < mas.length; i++) {
                int temp = 0;
                if (mas[i - 1] > mas[i]) {
                    temp = mas[i - 1];
                    mas[i - 1] = mas[i];
                    mas[i] = temp;
                }

            }
        }
    }

    public static void AnkaBubbleSort(int[] arr) {
        boolean swapped = true;
        int j = 0;
        int tmp;
        while (swapped) {
            swapped = false;
            j++;
            for (int i = 0; i < arr.length - j; i++) {

                if (arr[i] > arr[i + 1]) {
                    tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;
                    swapped = true;

                }
            }
        }
    }

}