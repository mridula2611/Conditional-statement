import java.util.Scanner;
public class cas2{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int mark = scan.nextInt();
        switch(mark/10){
            case 10:
            case 9:
                System.out.println('A');
                break;
            case 8:
            case 7:
                System.out.println('B');
                break;
            case 6:
            case 5:
                System.out.println('C');
                break;
            default:
                System.out.println("Fail");
        }
    }
}
