package DS.arrays;

/**
 * Created by Sushant on 5/18/2017.
 */
public class Sum2Array {

    private static int search(int[] arr, int n) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n)
                return i;
        }

        return -1;
    }

    private static boolean check2Sum(int[] input_array, int sum) {

        for (int i = 0; i < input_array.length; i++) {
            int a = sum - input_array[i];

            if (search(input_array, a) != -1)
                return true;

        }

        return false;
    }

    public static void main(String[] args) {
        int[] input_array = {1, 4, 45, 6, 10, -8};
        int n = 16;
        System.out.println(check2Sum(input_array, n));


    }


}
