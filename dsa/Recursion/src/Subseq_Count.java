import java.util.ArrayList;
import java.util.List;

public class Subseq_Count {
    static int subseq(int idx, int sum, int target, int[] arr) {
        if (idx == arr.length) {
            if (target == sum) {
                return 1;
            }
            return 0;
        }

        //pick
        sum = sum + arr[idx];
       int l =  subseq(idx + 1,  sum, target, arr);

       
       //not - pick
        sum = sum - arr[idx];
        int r = subseq(idx + 1,  sum, target, arr);
        return l + r;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 1};
        int target = 2;

       int count = subseq(0,  0, target, arr);
        System.out.println(count);
    }
}