import java.util.Scanner;
public class h3{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();
        if(age>=60)
            System.out.println("You are eligible for Senior citizen");
        else
            System.out.println("You are not eligible for Senior citizen");
    }
}