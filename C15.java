import java.util.Scanner;
public class C15{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        if(a%3==0 || a%7==0)
        System.out.println(a + " is divisible by 3 and 7");
        else
        System.out.println(a + " is not divisible by 3 and 5");
    }
}