import java.util.Scanner;
public class h18{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int speed = scan.nextInt();
        if(speed > 100)
            System.out.println("Over speeding! Fine imposed");
        else
            System.out.println("Speed is within Limit");
    }
}