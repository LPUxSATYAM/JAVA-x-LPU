import java.util.Scanner;

public class Calculator {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double d1 = sc.nextDouble();
        double d2 = sc.nextDouble();

        int choice = sc.nextInt();
        double result = 0.0;
        switch(choice)
        {
            case 1: result = d1+d2;
                    System.out.println("d1 + d2 = " + (int)result);
                    break;

            case 2: result = d1-d2;
                    System.out.println("d1 + d2 = " + (int)result);
                    break; 

            case 3: result = d1*d2;
                    System.out.println("d1 + d2 = " + (int)result);
                    break;

            case 4: result = d1/d2;
                    System.out.println("d1 + d2 = " + (int)result);
                    break;
                    
            default: System.out.println("Invalid Choice");                
        }

        sc.close();
    }
    
}
