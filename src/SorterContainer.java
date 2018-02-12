public class SorterContainer {
    public static void main(String args[]){
        int [] arr = {8,100,27,-3,4,56,32,1,67};
        dmytroBubbleSort(arr);
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

}
