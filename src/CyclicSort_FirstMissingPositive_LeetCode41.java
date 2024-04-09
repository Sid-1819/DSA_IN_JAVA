public class CyclicSort_FirstMissingPositive_LeetCode41 {
    public static void main(String[] args) {
        int []arr={7,8,9,11,12};

        System.out.println(cyclic(arr));

    }
    static int cyclic(int []arr){
        int i = 0;
        while ( i<arr.length) {
            int correct = arr[i]-1;

            if (arr[i]>0 &&arr[i]<=arr.length && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }


        }
        for (int j = 0; j <arr.length ; j++) {
            if(arr[j]!=j+1) {
                return j+1;
            }
        }return arr.length+1;
    }

    static void swap(int []arr,int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
