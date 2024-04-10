public class InfiniteSortedArray {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 5, 7, 9, 10, 90,
                100, 130, 140, 160, 170};
        int target = 100;
        System.out.println(Indexing(arr,target));


    }
    public static int Indexing(int []arr, int target ){
        int start = 0;
        int end = 1;

        while (target>arr[end]){
           int newStart= end +1;
           end =end + (start +1)*2;
           start= newStart;


        }return BS(arr,target,start,end);
    }
    public static int BS(int arr[], int target, int start, int end){

        while (start<= end ){
            int mid  = start + (end -start)/2;

            if (arr[mid]>target){
                end = mid-1;
            }else if (arr[mid]<target){
                start = mid +1;
            }else{
                return mid;
            }
        }return -1;
    }
}
