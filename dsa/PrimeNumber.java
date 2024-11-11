import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        System.out.println(isPrime(n)); //for checking given no is prime or not

        //for printing prime num b/w 1 to 100
        for(int i=1;i<100;i++)
        {
            if (isPrime(i))
                System.out.print(i + " ");
        }

    }
    static boolean isPrime(int n)
    {
        if(n<=1)
        {
            return false;
        }
        int c = 2;
        while(c * c <= n)
        {
            if (n % c==0)
            {
                return false;
            }
            c++;
        }
        return c * c > n;
    }
}
