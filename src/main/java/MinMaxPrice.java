import java.sql.Array;

public class MinMaxPrice {

    public static int[] minMax(int[] arr) {

        int min = 0;
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            if (min>=arr[i]){
                min=arr[i];
            }
            if (max<=arr[i]){
                max=arr[i];
            }
        }
        int [] minMax = {min,max};

        return minMax;
    }
}
