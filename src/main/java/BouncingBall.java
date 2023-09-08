public class BouncingBall {
    public static void main(String[] args) {

        int result = bouncingBall(30.0,0.66,1.5);
        System.out.println(result);
    }

    public static int bouncingBall(double h, double bounce, double window) {
        // your code


        int seeCount=1;
        while (h*bounce>window){
            h*=bounce;
            seeCount+=2;
        }

        return seeCount;
    }
}
