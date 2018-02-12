
    public class SorterContainer {
        public static void main(String args[]){
            int [] array = {8,100,27,-3,4,56,32,1,67};
            NikaBubbleSort(array);
            for(int i =0;i<array.length;i++){
                System.out.println(array[i]);
            }
        }

        public static void NikaBubbleSort(int[] mas) {
            for(int j = mas.length;j>0;j--){
                for(int i =1;i < mas.length;i++ ) {
                    int temp =0;
                    if(mas[i-1]>mas[i]) {
                        temp = mas[i-1];
                        mas[i-1] = mas[i];
                        mas[i]=temp;
                    }
                }
            }
        }
    }

