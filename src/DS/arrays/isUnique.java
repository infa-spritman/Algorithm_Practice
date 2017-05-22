package DS.arrays;

/**
 * Created by Sushant on 5/21/2017.
 */
public class isUnique {

    private static boolean solA(String s) {
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            int temp = (int) s.toLowerCase().charAt(i);

            if ((res & (1 << temp)) > 0)
                return false;

            res |= (1 << temp);
        }
        return true;
    }


    public static void main(String[] args) {

        System.out.println(solA("Abhia"));
    }
}
