import java.util.Scanner;
public class C16{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        if(a%2 == 0 && a%5 == 0 && a%8 != 0 )
                System.out.println(a + " is divisible by 2 and 5");
        else
        System.out.println(a + " is not divisible by 2 and 5");
    }
}