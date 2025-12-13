import java.util.Scanner;
public class C17{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int las = a % 10;
        int last =b % 10;
        if(las==last)
                System.out.println("equal");
        else
        System.out.println("is not equal");
    }
}