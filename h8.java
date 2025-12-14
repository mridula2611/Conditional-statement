import java.util.Scanner;
public class h8{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int pin = 2612;
        int ping = scan.nextInt();
        if(pin == ping){
            System.out.println("Allow Withdrawl");
        }else{
            System.out.println("Not Allow Withdrawl");
        }
    }
}