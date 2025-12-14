import java.util.Scanner;
public class h14{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int speed = scan.nextInt();
        if(speed > 100)
            System.out.println("Speed exceeds 100");
        else
            System.out.println("No");
    }
}