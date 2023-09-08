public class ReverseWords {
    public static void main(String[] args) {

        String actual = "double  spaces";
        String res= reverseWords(actual);
        System.out.println(res);
    }

    public static String reverseWords(final String original) {
        String[] words = original.split(" ");

        String result = " ";
        for (String word : words) {
            for (int i = word.length()-1; i >= 0 ; i--) {
                result += word.charAt(i);
            }
            result+=" ";
        }

        return result;
    }
}
