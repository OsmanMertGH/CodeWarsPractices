public class MissingLetter {
    public static void main(String[] args) {


    }

    public static char findMissingLetter(char[] array) {

        char missingCh=' ';
        for (int i = 0; i < array.length; i++) {
            if (!(array[i]+1==array[i+1])){
                missingCh=array[i];
            }
        }

        return missingCh;
    }
}
