import java.time.Duration;
public class Durations {
    public static void main(String[] args) {
        //PT- period of time
//        Duration hr=Duration.ofHours(12);
//        System.out.println(hr);
//
//        Duration min=Duration.ofMinutes(28);
//        System.out.println(min);
//
//        Duration sec=Duration.ofSeconds(14);
//        System.out.println(sec);
//
//        Duration nanosec=Duration.ofNanos(10);
//        System.out.println(nanosec);
//
//        Duration millisec=Duration.ofMillis(11);
//        System.out.println(millisec);
//
//        Duration days=Duration.ofDays(2);
//        System.out.println(days);
//
//        Duration zeros=Duration.ZERO;
//        System.out.println(zeros);

        Duration duration1 = Duration.ofHours(48);
        Duration duration2 = Duration.ofMinutes(30);
        System.out.println(duration1.plusDays(2));
        System.out.println(duration1.plus(duration2));
        System.out.println(duration1.plusHours(2));
        System.out.println(duration1.plusMinutes(2));
        System.out.println(duration1.plusSeconds(2));
        System.out.println(duration1.plusMillis(2));  //10^-3
        System.out.println(duration1.plusNanos(2));  //10^-9

        System.out.println(duration1.minus(duration2));
        System.out.println(duration1.minusHours(2));
        System.out.println(duration1.minusMinutes(2));
        System.out.println(duration1.minusSeconds(2));
        System.out.println(duration1.minusMillis(2));
        System.out.println(duration1.minusNanos(2));
        System.out.println(duration1.minusDays(2));

//        System.out.println(duration1.dividedBy(2));
//        System.out.println(duration1.isNegative());
//        System.out.println(duration1.minusDays(2));
//        System.out.println(duration1.minusDays(2).isNegative());
//        System.out.println(duration1.plusDays(5));
//        System.out.println(duration1.toDays());
//        System.out.println(duration1.abs());
    }
}
