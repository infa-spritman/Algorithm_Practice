package DS.arrays;


/**
 * Created by Sushant on 5/18/2017.
 */
public class LeadersArray {

    private static int[] findLeader(int[] arr, int size) {

        int max = arr[size - 1];
        int[] tempArray = new int[size];
        int position = 0;
        for (int i = size - 1; i >= 0; i--) {
            if (arr[i] >= max) {
                tempArray[position] = arr[i];
                max = arr[i];
                position++;
            }

        }
        return tempArray;
    }

    public static void main(String[] args) {
        int[] input_array = {16, 17, 4, 3, 5, 2};
        int size = input_array.length;
        for (int i : findLeader(input_array, size)) {
            if (i != 0)
                System.out.println(i);
        }
        System.out.println(5 ^ 9);

    }
}
