import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int arr[]=new int[5];
        for (int i =0;i<arr.length;i++){
            arr[i]=input.nextInt();

    }
        System.out.println(Arrays.toString(arr));

    }
}
