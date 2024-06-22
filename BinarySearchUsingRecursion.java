public class BinarySearchUsingRecursion {
    public static void main(String[] args) {

        int []arr = {1,4,6,8,13,45,67,88};
        int tar = 67;
        System.out.println(search(arr,tar,0,arr.length-1));
    }
    static int search(int []arr ,int tar, int s, int e){
        if(s>e){
            return -1;
        }
        int mid = s + (e-s)/2;
        if(arr[mid]==tar){
            return mid;
        }
        if(tar<arr[mid]){
            return search(arr,tar,s,mid-1);
        }
        return search(arr,tar,mid+1,e);
    }
}
