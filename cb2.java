import java.util.Scanner;
public class cb2{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        char ch = scan.next().charAt(0);
        if(Character.isDigit(ch))
        System.out.println( ch + " is a digit");
        else if(Character.isUpperCase(ch))
        System.out.println(ch + " is a Uppercase");
        else if(Character.isLowerCase(ch))
        System.out.println(ch + " is a Lowercase");
        else
        System.out.println(ch +" is a special symbol");
    }
}