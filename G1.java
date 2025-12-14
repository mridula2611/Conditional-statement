import java.util.Scanner;
public class G1{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        if(a == b && b == c && c == a)
        System.out.println(" is equilateral");
        else if(a == b || b == c || a == c)
        System.out.println(" is isoceles");
        else 
        System.out.println(" is scalene");
    }
}