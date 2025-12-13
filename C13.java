import java.util.Scanner;
public class C13{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        if(a<0)
        System.out.println(a + " is negative");
        else if(a>0)
        System.out.println(a + " is positive");
        else
        System.out.println(a + " is zero");
    }
}