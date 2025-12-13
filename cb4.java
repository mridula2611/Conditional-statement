import java.util.Scanner;
public class cb4{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        char ch = scan.next().charAt(0);
        if(Character.isDigit(ch))
        System.out.println( ch + " is a digit");
        else
        System.out.println(ch +" is not digit");
    }
}