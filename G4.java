import java.util.Scanner;
public class G4{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        if(a + b + c == 180)
            System.out.println("Valid triangle");
        else
             System.out.println("Invalid triangle");
    }
}