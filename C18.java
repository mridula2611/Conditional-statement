import java.util.Scanner;
public class C18{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        if(a>0 && a<10)
                System.out.println("Single-digit number");
        else if(a>10 && a<100)
        System.out.println("two-digit number");
        else
        System.out.println("three-digit number");
    }
}