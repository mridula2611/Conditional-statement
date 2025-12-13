import java.util.Scanner;
public class cb3{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        char ch = scan.next().charAt(0);
        if(Character.isLetter(ch))
        System.out.println( ch + " is a alpahabet");
        else
        System.out.println(ch +" is not alphabet");
    }
}