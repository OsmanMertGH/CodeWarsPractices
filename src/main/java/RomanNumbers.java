public class RomanNumbers {
    public String solution(int n) {

        String romanNum=String.valueOf(n);
        String roman="";

        for (int i = 0; i < romanNum.length(); i++) {
            if (romanNum.length()>3){
                for (int j = 0; j < romanNum.charAt(i); j++) {
                    roman+="M";
                }
            } else if (romanNum.length()>2){
                for (int j = 0; j < romanNum.charAt(i); j++) {
                    if (romanNum.charAt(i)==5){
                        roman+="D";
                        if (romanNum.charAt(i)-5>0){
                            roman+="C";
                        }
                    } else if (romanNum.charAt(i)<5) {
                        roman+="C";
                    }
                }
            }


        }
        return roman;
    }
}
