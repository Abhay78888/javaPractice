
import java.util.Scanner;
public class  Sum{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Input num 1----->");
        int num1=input.nextInt();
        System.out.print("Input num 2----->");
        int num2=input.nextInt();
//        int num1=0;
//        int num2=10;
        int sum= num1 + num2;
        System.out.println(sum);

    }
}
