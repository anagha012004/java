import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegexDemo {
    public static void main(String args[]) {
        Pattern pattern = Pattern.compile("Anagha", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("there is a girl named anagha");
        boolean matchFound = matcher.find();
        if (matchFound) {
            System.out.println("Match Found");
        } else {
            System.out.println("Match not found");
        }
    }
}