import java.util.Scanner;
public class h5{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int temp = scan.nextInt();
        if(temp>100)
            System.out.println("Fever");
        else 
            System.out.println("Normal");
    }
}