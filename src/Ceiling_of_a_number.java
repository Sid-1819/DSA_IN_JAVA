public class Ceiling_of_a_number {
    public static void main(String[] args) {
        int []arr= {3,5,7,11,23,45,67};
        int target= 99;
        System.out.println(BS(arr,target));
    }
    static int BS(int []arr, int target){
        if(target>arr[arr.length-1]){
            return -1;
        }
        boolean isAsc;
        int start = 0;
        int end = arr.length-1;
        isAsc= arr[start] < arr[end];
        int mid = 0;
        while (start<=end){
             mid = start + (end-start)/2;
            if(arr[mid] ==target){
                return arr[mid];
            }

            if(isAsc){

                 if(arr[mid]>target){
                    end = mid-1;
                }else if(arr[mid]<target){
                    start = mid +1;

                }
            }else {
                 if(arr[mid]<target){
                    end = mid-1;
                }else if(arr[mid]>target){
                    start = mid +1;

                }

            }


        }return arr[mid+1];
    }
}
