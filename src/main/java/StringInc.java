public class StringInc {
    public static void main(String[] args) {

        String ac1= "foobar001";
        String res = incrementString(ac1);
        System.out.println(res);
    }

    public static String incrementString(String str) {
        int strLength = str.length();

        String result= "";

        if (Character.isDigit(str.charAt(strLength-1))){
            for (int i = 0; i < strLength-1; i++) {
                result+=str.charAt(i);
            }
            int num=(int)str.charAt(strLength-1);
            num++;
            result+=num;
        } else
            result+=str+1;
        return result; // you code here
    }
}
