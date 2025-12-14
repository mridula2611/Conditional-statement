import java.util.Scanner;
public class h12{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int battery = scan.nextInt();
        if(battery >= 80)
            System.out.println("Full");
        else if(battery >= 30)
            System.out.println("Moderate");
        else
            System.out.println("Low");
    }
}