import java.util.Scanner;
public class cb5{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        char ch = scan.next().charAt(0);
        char cy = scan.next().charAt(0);
        if(ch==cy)
        System.out.println(" is equal");
        else
        System.out.println(" is not equal");
    }
}