import java.util.Scanner;
public class h4{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int battery = scan.nextInt();
        if(battery<=20)
            System.out.println("Low Battery");
        else if(battery<=50)
            System.out.println("50% Consumed");
        else 
            System.out.println("Battery full");
    }
}