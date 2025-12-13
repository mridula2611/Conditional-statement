import java.util.Scanner;
public class C19{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = a*b;
        if(c>0)
                System.out.println("Positive number");
        else
        System.out.println("negative number");
    }
}