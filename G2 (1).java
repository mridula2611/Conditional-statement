import java.util.Scanner;
public class G2{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b= scan.nextInt();
        int c = scan.nextInt();
        if((a*a + b*b == c*c || a*a + c*c == b*b ||b*b + c*c == a*a))
        System.out.println("triangle is right-angled");
        else
        System.out.println("triangle is not right-angled");
    }
}