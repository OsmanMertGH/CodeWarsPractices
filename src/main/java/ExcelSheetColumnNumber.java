public class ExcelSheetColumnNumber {

    public static void main(String[] args) {
        String str1 = "A";
        int result1 = titleToNumber(str1);
        System.out.println(result1);

        String str2 = "AB";
        int result2 = titleToNumber(str2);
        System.out.println(result2);

        String str3 = "ZY";
        int result3 = titleToNumber(str3);
        System.out.println(result3);
    }

    public static int titleToNumber(String columnTitle) {
        int result = 0;
        for (int i = 0; i < columnTitle.length(); i++) {
            char c = columnTitle.charAt(i);
            result = result * 26 + (c - 'A' + 1);
        }
        return result;
    }
}
