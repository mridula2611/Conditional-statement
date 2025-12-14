import java.util.Scanner;
public class g11{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int temp = scan.nextInt();
        if(temp<15)
            System.out.println("Cold");
        else if(temp<25)
            System.out.println("Pleasant");
        else if(temp<35)
            System.out.println("Hot");
        else
            System.out.println("Heatwave");
    }
}