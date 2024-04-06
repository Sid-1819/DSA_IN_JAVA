import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

    static void Bubble(int []arr){
        for (int i=0;i<arr.length-1;i++){
            for(int j = 0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                }
            }
        }

    }
    static void Insertion(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }else{
                    break;
                }
            }

        }

    }

    static void Selection(int[] arr){
        for(int i=0;i<arr.length;i++){
            int end  = arr.length-i-1;
            int maxIndex = getMaxIndex(arr,0,end);
            swap(arr,maxIndex,end);

        }


    }
    static int getMaxIndex(int []arr,int start, int end){
        int max = start;
        for (int i = start;i<=end; i++) {
            if(arr[max]<arr[i]){
                max =i;
            }

        }return max;
    }


    static void swap(int[]arr,int first,int second){
        int temp= arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
    static void ChooseAlgo(int []arr){
        System.out.println("Enter your Algorithm:");
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        if (Objects.equals(a, "Bubble")){
            Bubble(arr);
            System.out.println("Bubble"+ Arrays.toString(arr));
        }
        if (Objects.equals(a, "Selection")){
            Selection(arr);
            System.out.println("Selection"+ Arrays.toString(arr));
        }
        if (Objects.equals(a, "Insertion")){
            Insertion(arr);
            System.out.println("Insertion"+ Arrays.toString(arr));
        }else{
            System.out.println("Algo does not exist");
        }
    }

}
