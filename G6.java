import java.util.Scanner;
public class G6{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();
        if(a == b && b == c && c == d)
            System.out.println("Square");
        else if(a==c && b==d && a!=b)
             System.out.println("Rectangle");
        else
             System.out.println("Inavlid");
    }
}