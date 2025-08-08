import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
     /* 1st way - 2 pointers
       int arr[] = { 1,2,3,4,5};
     rev(0,arr.length-1,arr);
        System.out.println(Arrays.toString(arr));
    }
     static void rev(int i , int j,int[] arr){
        if(i>=j) return ;
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        rev(i+1,j-1,arr); */

        int arr[] = {4, 1, 2, 5, 6};
        f(0, arr);
        System.out.println(Arrays.toString(arr));
    }

    static void f(int i, int[] arr) {
        if (i >= arr.length / 2) return;
        int temp = arr[i];
        arr[i] = arr[arr.length - i - 1];
        arr[arr.length - i - 1] = temp;
        f(i + 1, arr);
    }
}