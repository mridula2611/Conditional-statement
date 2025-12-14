import java.util.Scanner;
public class cas4{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int month = scan.nextInt();
        switch(month){
            case 1:
            case 2:
            case 12:
            case 11:
            System.out.println("Winter");
            break;
            case 3:
            case 4:
            case 6:
            System.out.println("Summer");
            default:
            System.out.println("Moderate");
        }
    }
}