import java.time.LocalDate;
import java.time.LocalTime;
public class Time {
    public static void main(String args[]){
        //past date or particular date may be future date's too
        LocalTime maxTime=LocalTime.MAX;
        System.out.println(maxTime);

        LocalTime minTime=LocalTime.MIN;
        System.out.println(minTime);

        LocalTime noon=LocalTime.NOON;
        System.out.println(noon);

        LocalTime midnight=LocalTime.MIDNIGHT;
        System.out.println(midnight);

        LocalTime today=LocalTime.now();
        System.out.println(today);

        LocalTime hrmin=LocalTime.of(12,28);
        System.out.println(hrmin);

        LocalTime hrminsec=LocalTime.of(12,28,14);
        System.out.println(hrminsec);

        LocalTime hmsn=LocalTime.of(12,28,14,10);
        System.out.println(hmsn);

        System.out.println(LocalTime.now());
        LocalTime endtime=LocalTime.now().plusHours(2).plusMinutes(3).plusSeconds(4);
        System.out.println(endtime);

    }
}
