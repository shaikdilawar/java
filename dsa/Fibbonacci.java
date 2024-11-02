//public class Fibbonacci{
//
//    public static void main(String args[]){
//        int n1=0,n2=1,n3,n=10;
//        System.out.print(n1 + " " + n2 + " ");
//        for(int i=2;i<=n;i++){
//            n3=n1+n2;
//            System.out.print(n3 + " ");
//            n1=n2;
//            n2=n3;
//
//        }
//    }
//}

import java.util.Scanner;
public class Fibbonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n1=0,n2=1,n3;

        System.out.print(n1 + " " + n2 + " ");

        for(int i = 2; i <=n ; i++) {
            n3=n1+n2;
            System.out.print(n3 +" ");
            n1=n2;
            n2=n3;
        }
    }
}


//public class Fibbonacci {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int n1 = 0;
//        int n2 = 1;
//        int i = 2;
//        while (i <= n) {
//            int temp = n2;
//            n2 = n2 + n1;
//            n1 = temp;
//            i++;
//        }
//        System.out.println(n2);
//    }
//}