import java.util.Scanner;
public class Vowels {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        char c=input.next().charAt(0);
        if (c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
            System.out.println("vowels");
        }
        else{
            System.out.println("consonants");
        }

    }
}
