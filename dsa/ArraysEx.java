import java.util.Scanner;
import java.util.Arrays;

class ArraysEX{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        int[] arr = new int[5];
//
//        for (int i = 0; i < arr.length; i++) {       //for taking the array input
//            arr[i] = sc.nextInt();
//        }
//
//              System.out.println(Arrays.toString(arr));    //converts the array to string

//        for (int i = 0; i < arr.length; i++) {    / / for printing the array elements
//            System.out.print(arr[i] + " ");

//        for (int num : arr) {                     //for every element in array , print the element
//            System.out.print(num + " ");          //here num represents element of the array

        String[] str = new String[5];
        for (int i = 0; i < str.length; i++) {
            str[i] = sc.next();
        }

        System.out.println(Arrays.toString(str));

        }

}

