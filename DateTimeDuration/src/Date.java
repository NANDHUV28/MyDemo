import java.time.LocalDate;
public class Date {
    public static void main(String[] args) {
        //past date or particular date may be future date's too
        LocalDate june26=LocalDate.of(2024,6,26);
        LocalDate aug10=LocalDate.of(2024,8,10);
        System.out.println(june26);
        System.out.println(aug10);
        //present date
        LocalDate today=LocalDate.now();
        System.out.println(today);
        //max year value ie 9999
        LocalDate maxValue=LocalDate.MAX;
        System.out.println(maxValue);
        //min year value ie -9999
        LocalDate minValue=LocalDate.MIN;
        System.out.println(minValue);
    }
}
