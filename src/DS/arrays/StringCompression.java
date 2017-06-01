package DS.arrays;

/**
 * Created by Sushant on 6/1/2017.
 */
public class StringCompression {

    private static String compressedString(String inputString) {
        StringBuilder sb = new StringBuilder();
        char tempChar = inputString.charAt(0);
        char[] charArray = inputString.toCharArray();
        int count = 0;

        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == tempChar) {
                count++;
            } else {

                sb.append(tempChar).append(count);
                tempChar = charArray[i];
                count = 1;
            }
            if (i == (charArray.length - 1))
                sb.append(tempChar).append(count);

        }


        return sb.length() < inputString.length() ? sb.toString() : inputString;
    }


    public static void main(String[] args) {

        System.out.println(compressedString("aabcccccaaa"));
    }


}
