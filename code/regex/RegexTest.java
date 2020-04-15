
import java.util.regex.*;

public class RegexTest{
    public static void main(String [] args){
        System.out.println(Pattern.matches("(?i:^\\d+\\s+justin\\s+.+)", "22 	Jutin	16,221 	Destiny 	9,739"));
        //System.out.println(Pattern.matches("^\\d+\\s+\\w+\\s+.+emily\\s+.+", "1    jacob  12,232  emily   34353"));
        System.out.println(Pattern.matches("^\\d+\\s+\\w+\\s+.+emily\\s+.+", "1    jacob  12,23223232  emily  34353"));
        //System.out.println(Pattern.matches("^\\d+\\s+jacob\\s+.+", "1    jacob  12,232  emily   34353"));

    }
}
