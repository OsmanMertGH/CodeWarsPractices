public class Multiples3or5 {
    public static void main(String[] args) {

        System.out.println(solution(25));
    }

    public static int solution(int number) {
        int result = 0;
        for (int i = 0; i < number; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                result += i;
            }
        }
        return result;
    }
}
