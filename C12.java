import java.util.Scanner;
public class C12{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int first = a%10;
        if(first%2==0)
        System.out.println(a + " is even");
        else
        System.out.println(a + " is odd");
    }
}