import java.util.Scanner;

public class SwapWithoutTEmp {

    static void swapWithoutTemp( int a , int b ){

        System.out.println(" values before swapping ");

        System.out.println( " a : " + a);

        System.out.println(" b : " + b);

        // LOGIC FOR SWAPPING

        a = a + b;

        b = a - b;

        a = a - b;

        System.out.println(" values after swapping ");

        System.out.println(" a : " + a);

        System.out.println(" b : " + b);

    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println(" enter the value of a ");

        int a = sc.nextInt();

        System.out.println(" enter the value of b ");

        int b = sc.nextInt();

        swapWithoutTemp(a, b);
    }
    
}
