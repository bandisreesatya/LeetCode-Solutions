import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        
        LocalDate a1 = LocalDate.parse("2019-" + arriveAlice);
        LocalDate a2 = LocalDate.parse("2019-" + leaveAlice);
        LocalDate b1 = LocalDate.parse("2019-" + arriveBob);
        LocalDate b2 = LocalDate.parse("2019-" + leaveBob);

        LocalDate laterArrival = a1.isAfter(b1) ? a1 : b1;
        LocalDate earlierLeave = a2.isBefore(b2) ? a2 : b2;

        long days = Math.max(0,ChronoUnit.DAYS.between(laterArrival, earlierLeave) + 1);

       return (int)days;
    }
}