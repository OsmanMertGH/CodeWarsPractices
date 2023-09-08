public class Troll {
    public static void main(String[] args) {

        String str="This website is for losers LOL!";
        String result=disemvowel(str);

        System.out.print(result);

    }

    public static String disemvowel(String str) {
        // Code away...
        String result="";
        for (int i = 0; i < str.length()-1; i++) {
            if (!(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='o'||str.charAt(i)=='i'||str.charAt(i)=='u'||str.charAt(i)==' ')){
                result+=str.charAt(i);
            }
        }

        return result;
    }
}
