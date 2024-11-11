import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        System.out.println(isArmstrong(n)); //for checking given no is armstrong or not

        //for printing armstrong num b/w 100 to 1000
        for(int i =100 ;i<1000;i++)
        {
            if (isArmstrong(i))
                System.out.print(i + " ");
        }
    }
    static boolean isArmstrong(int n)
    {
        int original=n,rem;
        int sum = 0;
        while(n>0)
        {
            rem = n%10;
            sum = sum +rem*rem*rem;
            n = n/10;
        }
        return sum==original;
    }
}
