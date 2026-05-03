import java.util.Scanner;

public class Prime {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        for(int i=2; i<=n; i++)
        {   
            boolean isPrime = true;
            for(int j = 2; j <= i-1; j++)
            {
                if(i % j == 0)
                {
                    isPrime = false;
                    break;
                }
            }

            if(isPrime)
            {
                System.out.print(i + " ");
            }
        }
        sc.close();
    }
}
