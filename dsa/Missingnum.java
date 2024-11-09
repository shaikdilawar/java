public class Missingnum {
    public static void main(String[] args) {
        int[] arr = {8, 2, 4, 5, 3, 7, 1};

        int n= arr.length + 1, sum1=0,n3,sum2=0;
        sum1 = (n*(n+1))/2;
        for(int i=0;i<n-1;i++)
        {
            sum2+= arr[i];
        }
        n3 = sum1 - sum2;
        System.out.println(n3);

    }
}

