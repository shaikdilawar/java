import java.util.ArrayList;
import java.util.List;

public class Subseq_Any_1 {
    static boolean subseq(int idx, List<Integer> ds, int sum, int target, int[] arr) {
        if (idx == arr.length) {
            if (target == sum) {
                System.out.println(ds);
                return true;
            }
            else return false;
        }

        ds.add(arr[idx]);

        //pick
        sum = sum + arr[idx];
        if(subseq(idx + 1, ds, sum, target, arr)==true) return true;

        ds.remove(ds.size() - 1);

        //not - pick
        sum = sum - arr[idx];
        if(subseq(idx + 1, ds, sum, target, arr)==true) return true;

        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 1};
        int target = 2;
        List<Integer> ds = new ArrayList<>();
        subseq(0, ds, 0, target, arr);
    }
}
