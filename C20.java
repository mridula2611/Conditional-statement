import java.util.Scanner;
public class C20{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        char ch = scan.next().charAt(0);
        int as =(int)ch;
        if(as%2==0)
                System.out.println("even number");
        else
        System.out.println("odd number");
    }
}