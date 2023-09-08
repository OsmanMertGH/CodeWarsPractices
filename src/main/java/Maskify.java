public class Maskify {
    public static void main(String[] args) {

        String str = "4556364607935616";
        String result= maskify(str);
        System.out.println(result);

    }

    public static String maskify(String str) {

        String result = "";

        if (str.length() > 4) {
            for (int i = 0; i < str.length() - 4; i++) {
                result += '#';
            }

            for (int i = str.length() - 4; i < str.length(); i++) {
                result += str.charAt(i);
            }
        }
        else return str;

        return result;
    }
}
