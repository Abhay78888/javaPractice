import java.util.Scanner;
public class factros {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("enter the number");
        int n = input.nextInt();
        int count;
        for (int i =1 ; i< n;  i++ ){
            if(n%i==0){
                System.out.println(i);
            }


        }
    }
}
