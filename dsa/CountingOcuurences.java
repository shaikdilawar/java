//public class CountingOcuurences {
//    public static void main(String[] args) {
//        int a[]= {1, 2, 2, 2, 2, 3, 4, 7 ,8 ,8 };
//       int x=2;
//       int count=0;
//        for(int i=0;i<a.length;i++){
//            if(x==a[i])
//            count++;
//        }
//        System.out.println(count);
//
//    }
//}

public class CountingOcuurences  {
    public static void main(String[] args) {
        int n = 1222234788;
        int count = 0;

        while (n > 0) {
            int rem = n % 10;
            if (rem == 2){
                count++;
            }
            n = n / 10;}
        System.out.println(count);
    }
}
