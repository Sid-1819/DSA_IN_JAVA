class BS{
    public static void main(String[] args) {
        int []arr = {-12,-4,0,2 , 12, 45};
        int target= 0;
        int ans = BinarySearch(arr,target);
        System.out.println(ans);
    }
    static int BinarySearch(int [] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
          int mid = start + (end - start) / 2;

        if (arr[mid] == target) {
        return mid;
        } else if(arr[mid]>target){
            end = mid-1;
        }else if(arr[mid]<target){
            start= mid +1;
        }
        }

        return -1;
    }
}
