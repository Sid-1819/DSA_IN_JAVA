import java.util.ArrayList;
import java.util.List;

public class CyclicSort_FindDuplicatesInAnArray_LeetCode442 {
    public static void main(String[] args) {

    }
    public List<Integer> findDisappearedNumbers(int[] arr) {
    int i = 0;
        while(i<arr.length){
        int correct = arr[i]-1;
        if(arr[i]!=arr[correct]){
            swap(arr,i,correct);
        }else{
            i++;
        }
    }
    List<Integer> a = new ArrayList();
        for (int j = 0; j < arr.length; j++) {
        if(arr[j]!=j+1){
            a.add(arr[j]);
        }
    }
        return a;
}



    private static void swap(int[]arr,int first, int second) {
        int temp= arr[first];
        arr[first] = arr[second];
        arr[second] =temp;
    }
}
