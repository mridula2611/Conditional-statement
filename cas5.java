import java.util.Scanner;
public class cas5{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int option = scan.nextInt();
        switch(option){
            case 1:
            System.out.println("Withdraw");
            case 2:
            System.out.println("Deposit");
            case 3:
            System.out.println("Check balance");
            default:
            System.out.println("Exit");
        }
    }
}