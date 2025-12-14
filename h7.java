import java.util.Scanner;
public class h7{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int rates = scan.nextInt();
        double bill = 0;
        if(rates <= 100){
            bill=0;
        }
        else if(rates<=300){
             bill = (rates-100) * 5;
        }
        else{
            bill = (200*5) + (rates -300)*10;
        }
        if(rates>500){
            bill = bill + (bill * 0.10);
        }
         System.out.println(bill);
         scan.close();
    }
}