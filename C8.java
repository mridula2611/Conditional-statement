import java.util.Scanner;
public class C8{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int dig = a % 10;
        if(dig % 3 ==0)
        System.out.println(a + " is divisible by 3");
        else
        System.out.println(a + " is not divisible by 3");
    }
}