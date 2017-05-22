package DS.arrays;

/**
 * Created by Sushant on 5/21/2017.
 */
public class isPermutation {

    public static int convertToBit(String s) {
        int res = 0;

        for (int i = 0; i < s.length(); i++) {

            int c = (int) s.charAt(i);
            res = res | (1 << c);
        }

        return res;

    }


    public static boolean isPermute(String a, String b) {


        if (a.length() != b.length())
            return false;
        int bitA = convertToBit(a);
        int bitB = convertToBit(b);

        //return !((bitA ^ bitB)>0);
        return (bitA & bitB) == bitA;

    }

    public static void main(String[] args) {
//        System.out.println((int)'a');
//        System.out.println((int)'A');
//        System.out.println(convertToBit("a"));
//        System.out.println(convertToBit("A"));
        System.out.println(isPermute("abhi", "bhiA"));
    }
}
