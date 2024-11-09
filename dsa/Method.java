import java.util.Scanner;

public class Method {
    public static void main(String[] args) {
//     int ans = sum2();
//        System.out.println(ans);
        int ans = sum3(41,6);
        System.out.println(ans);
    }

    static int sum3(int a , int b){
        int sum = a + b;
        return sum;
    }

    //return-type
    static int sum2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1 ");
        int num1 = sc.nextInt();
        System.out.println("Enter num2");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
     return sum;
    }

    static void sum()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1 ");
        int num1 = sc.nextInt();
        System.out.println("Enter num2");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.println(sum);
    }

}

