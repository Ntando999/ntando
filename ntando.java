import java.util.Scanner;

public class ntando{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int x;
        int y;
        int z;

        System.out.println("enter your first number");
        x =  scan.nextInt();
        System.out.println("enter your second number");
        y = scan.nextInt();
        z = x-y;
        System.out.println("your answer is:--"+z);
        
        
        
    }
}