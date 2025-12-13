import java.util.Scanner;
public class C9{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        if((a&1)==0)
        System.out.println(a + " is even number");
        else
        System.out.println(a + " is odd number");
    }
}