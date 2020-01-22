package regex;

public class Regex {
    public static void main(String[] args) {
        String s ="public static void main(String[] args) {";
        for(String wodr : s.split("\\W+")){
            System.out.println(wodr);
        }

    }
}
