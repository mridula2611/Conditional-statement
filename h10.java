import java.util.Scanner;
public class h10{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String color = scan.nextLine();
        if(color.equals("red")){
            System.out.println("Stop");
        }else if(color.equals("green")){
            System.out.println("Go");
        }else{
            System.out.println("Ready");
        }
    }
}