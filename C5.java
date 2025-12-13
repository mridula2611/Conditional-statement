import java.util.Scanner;
public class C5{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        if(a >= 100 && a <= 999)
            System.out.println(a+" is a 3-digit number");
        else
            System.out.println(a +" is not a 3-digit number");
    }
}