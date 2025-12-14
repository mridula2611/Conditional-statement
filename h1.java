import java.util.Scanner;
public class h1{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int bill = scan.nextInt();
        if(bill>5000){
            int dis = (bill*20)/100;
            int finals = bill - dis;
            System.out.println(finals);
        }else if(bill>2000){
            int dis = (bill*10)/100;
            int finals = bill - dis;
            System.out.println(finals);
        }else if(bill>1000){
            int dis = (bill*10)/100;
            int finals = bill - dis;
            System.out.println(finals);
        }else{
            System.out.println("0");
        }
        
    }
}