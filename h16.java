import java.util.Scanner;
public class h16{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int day = scan.nextInt();
        if(day == 1|| day == 2 ||day == 3 || day == 4 || day ==5)
            System.out.println("Weekday price");
        else
            System.out.println("Weekend price");
    }
}