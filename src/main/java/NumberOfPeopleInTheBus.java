import java.util.ArrayList;

public class NumberOfPeopleInTheBus {
    public static int countPassengers(ArrayList<int[]> stops) {
        //Code here!

        int getPassanger = 0;
        int getOffPass;

        for (int[] stop : stops) {
            getPassanger+= stop[0]-stop[1];
        }


        return getPassanger;
    }
}
