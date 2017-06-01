package DS.arrays;

/**
 * Created by Sushant on 6/1/2017.
 */
public class StringRotation {

    public static boolean isRotate(String s1, String s2) {

        StringBuilder sb = new StringBuilder();
        sb.append(s1).append(s1);
        if (sb.indexOf(s2) != -1)
            return true;

        return false;
    }

    public static void main(String[] args) {

        System.out.println(isRotate("bottleerwat", "waterbottle"));
    }
}

