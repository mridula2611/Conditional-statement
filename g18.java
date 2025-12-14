import java.util.Scanner;
public class g18{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int litres = scan.nextInt();
        double bill=0;
        if(litres <= 1000){
            bill = 0;
        }
        else if (litres <= 3000){
            bill = ((litres - 1000)/ 1000.0) * 5;
        }else{
            bill = (2000 - 1000.0) * 5 +((litres - 3000)/1000.0) * 10;
        }
        System.out.println(bill);
    }
}