import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[]arr = {1,5,6,3,7,2};
        BubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void BubbleSort(int []arr){
        for (int i = 0; i < arr.length-1; i++) {
            for(int j=1;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){

                    swap(arr,j,j+1);
                }
            }

        }

    }
    static void swap(int []arr,int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
