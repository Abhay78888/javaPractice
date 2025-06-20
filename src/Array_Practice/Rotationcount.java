package Array_Practice;

public class Rotationcount {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,7};
        int ans=pivot(arr);
        System.out.println(ans+1);

    }

    public static int pivot(int [] arr){
        int start=0;
        int end = arr.length -1;
        while(start<=end){
            int mid = start+(end - start)/2;
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if (mid>start && arr[mid] < arr[mid-1] ){
                return mid-1;

            }
            if (arr[start] < arr[mid]) {
                start= mid +1;


            }
            else{
                end = mid -1;


            }

        }
        return -1;
    }
}
