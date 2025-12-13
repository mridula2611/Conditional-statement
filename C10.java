import java.util.Scanner;
public class C10{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = a + b;
        if(c%2 == 0)
            System.out.println("even");
        else
            System.out.println("odd");
    }
}