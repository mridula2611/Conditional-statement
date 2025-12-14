import java.util.Scanner;
public class h9{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int balance = scan.nextInt();
        int withd = scan.nextInt();
        if(withd <= balance && withd % 100==0){
            System.out.println("Withdrawal valid");
        }else{
            System.out.println("Insufficient Balance");
        }
    }
}