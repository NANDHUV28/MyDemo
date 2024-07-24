import java.time.Duration;
import java.time.LocalTime;

public class EndTime {
    public static void main(String[] args) {
        System.out.println(LocalTime.now());
        System.out.println(Duration.ofSeconds(24));
        long minutes=Duration.ofHours(4).toMinutes();
        LocalTime endTime=LocalTime.now().plusHours(3).plusMinutes(46).plusSeconds(32).plusNanos(7892136);
        System.out.println(endTime);
        endTime=LocalTime.of(2,45,34,2343432);
        System.out.println(endTime);
        System.out.println(minutes);
        endTime=LocalTime.now().plusMinutes(minutes);
        System.out.println(endTime);
    }
}
