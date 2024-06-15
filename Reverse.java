import java.util.*;

public class Reverse {
    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder("Anagha");
        for (int i = 0; i < sb.length() / 2; i++) {
            int Front = i;
            int Back = sb.length() - 1 - i;
            char atFront = sb.charAt(Front);
            char atBack = sb.charAt(Back);
            sb.setCharAt(Front, atBack);
            sb.setCharAt(Back, atFront);
        }
        System.out.println(sb);
    }

}
