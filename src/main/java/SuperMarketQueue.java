public class SuperMarketQueue {

    public static void main(String[] args) {

    }


    public static int solveSuperMarketQueue(int[] customers, int n) {
        if (customers.length == 0)
            return 0;

        int totalTime=0;
        if (customers.length > 0 && n == 1) {
            for (int each : customers) {
                totalTime+=each;
            }
        } else {
            for (int each : customers) {
                int [] tills = new int[n];
                for (int i = 0; i < tills.length; i++) {
                    tills[i]=each;
                    tills[i+1]=each;
                }
            }
        }


        return 0;
    }
}
