import java.time.*;
import java.time.temporal.*;

class Solution {
    public int daysBetweenDates(String date1, String date2) {

        LocalDate a1 = LocalDate.parse(date1);
        LocalDate a2 = LocalDate.parse(date2);

        return (int) Math.abs(ChronoUnit.DAYS.between(a1, a2));

    }
}