import java.util.Scanner;
public class C1{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        if(a>b)
            System.out.println(a +" is greatest");
        else
            System.out.println( b +" is greatest");
    }
}