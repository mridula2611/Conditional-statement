import java.util.Scanner;
public class h2{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();
        if(age>=18)
            System.out.println("You are eligible for voting");
        else
            System.out.println("You are not eligible");
    }
}