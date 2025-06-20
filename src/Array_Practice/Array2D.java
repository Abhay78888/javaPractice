package Array_Practice;

import java.util.Arrays;

public class Array2D {

    public static void main(String[] args) {
        int[][] arr={
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };
        System.out.println(Arrays.toString(arr2D(arr,8)));


    }

    public static int[] arr2D(int[][] matrix ,int target){
        int r =0;

        int c = matrix.length-1;
        while(r<matrix.length && c>=0){
            if(matrix[r][c] == target){
                return new int[]{r,c};
            }
            else if(matrix[r][c]<target){
                r++;
            }
            else{
                c--;
            }


        }
        return new int[] {-1,-1};
    }
}
