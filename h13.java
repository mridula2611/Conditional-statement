import java.util.Scanner;
public class h13{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();
        if(age < 12)
            System.out.println("Child");
        else if(age < 25)
            System.out.println("Adult");
        else
            System.out.println("Senior");
    }
}