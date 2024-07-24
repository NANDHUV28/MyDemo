import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import  java.util.Scanner;

public class RoomManagement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        MeetingRoom room1=new MeetingRoom("Room12",200,8);
        MeetingRoom room2=new MeetingRoom("Room28",100,10);
        ZoomMeetingRoom room3=new ZoomMeetingRoom("Room14",210,12,"Meet28","abcd0102");
        ZoomMeetingRoom room4=new ZoomMeetingRoom("Room1110",220,14,"Meet12","ab0102");


        EmployeeBooking booking1=new EmployeeBooking("Nandhini28", LocalDate.of(2024,01,28),LocalTime.of(12,28,14), Duration.ofMinutes(40),room1);
        EmployeeBooking booking2=new EmployeeBooking("Nandhu28", LocalDate.of(2024,03,28),LocalTime.of(6,28,14), Duration.ofMinutes(30),room2);
        EmployeeBooking booking3=new EmployeeBooking("Nandhuv28", LocalDate.of(2024,04,28),LocalTime.of(9,28,14), Duration.ofMinutes(20),room3);
        EmployeeBooking booking4=new EmployeeBooking("Nands28", LocalDate.of(2024,02,28),LocalTime.of(3,28,14), Duration.ofMinutes(10),room4);

        System.out.println(booking1.getEmployeeId()+" "+booking1.getDate()+" "+booking1.getTime()+" "+booking1.getDuration()+" "+booking1.getMeetingRoom().getId());
        System.out.println(booking2.getEmployeeId()+" "+booking2.getDate()+" "+booking2.getTime()+" "+booking2.getDuration()+" "+booking2.getMeetingRoom().getId());
        System.out.println(booking3.getEmployeeId()+" "+booking3.getDate()+" "+booking3.getTime()+" "+booking3.getDuration()+" "+booking3.getZoomMeetingRoom().getId());
        System.out.println(booking4.getEmployeeId()+" "+booking4.getDate()+" "+booking4.getTime()+" "+booking4.getDuration()+" "+booking4.getZoomMeetingRoom().getId());

        System.out.println("provide date: ");
        int y=sc.nextInt();
        int m=sc.nextInt();
        int date=sc.nextInt();
        LocalDate gettingDate=LocalDate.of(y,m,date);
        if(gettingDate.compareTo(booking1.getDate())==0){
            if(!booking2.getZoomFacilty()){
                System.out.println(booking1.getMeetingRoom().getId());
                System.out.println(booking1.getMeetingRoom().getCapacity());
                System.out.println(booking1.getMeetingRoom().getFloor());
            }
            else{
                System.out.println(booking1.getZoomMeetingRoom().getId());
                System.out.println(booking1.getZoomMeetingRoom().getCapacity());
                System.out.println(booking1.getZoomMeetingRoom().getFloor());
                System.out.println(booking1.getZoomMeetingRoom().getZoomAccountId());
                System.out.println(booking1.getZoomMeetingRoom().getZoomDeviceId());
            }
        }
        if(gettingDate.compareTo(booking2.getDate())==0){
            if(!booking3.getZoomFacilty()){
                System.out.println(booking2.getMeetingRoom().getId());
                System.out.println(booking2.getMeetingRoom().getCapacity());
                System.out.println(booking2.getMeetingRoom().getFloor());
            }
            else{
                System.out.println(booking2.getZoomMeetingRoom().getId());
                System.out.println(booking2.getZoomMeetingRoom().getCapacity());
                System.out.println(booking2.getZoomMeetingRoom().getFloor());
                System.out.println(booking2.getZoomMeetingRoom().getZoomAccountId());
                System.out.println(booking2.getZoomMeetingRoom().getZoomDeviceId());
            }
        }
        if(gettingDate.compareTo(booking3.getDate())==0){
            if(!booking3.getZoomFacilty()){
                System.out.println(booking3.getMeetingRoom().getId());
                System.out.println(booking3.getMeetingRoom().getCapacity());
                System.out.println(booking3.getMeetingRoom().getFloor());
            }
           else{
                System.out.println(booking3.getZoomMeetingRoom().getId());
                System.out.println(booking3.getZoomMeetingRoom().getCapacity());
                System.out.println(booking3.getZoomMeetingRoom().getFloor());
                System.out.println(booking3.getZoomMeetingRoom().getZoomAccountId());
                System.out.println(booking3.getZoomMeetingRoom().getZoomDeviceId());
            }
        }
        if(gettingDate.compareTo(booking4.getDate())==0){
            if(!booking4.getZoomFacilty()){
                System.out.println(booking4.getMeetingRoom().getId());
                System.out.println(booking4.getMeetingRoom().getCapacity());
                System.out.println(booking4.getMeetingRoom().getFloor());
            }
            else{
                System.out.println(booking4.getZoomMeetingRoom().getId());
                System.out.println(booking4.getZoomMeetingRoom().getCapacity());
                System.out.println(booking4.getZoomMeetingRoom().getFloor());
                System.out.println(booking4.getZoomMeetingRoom().getZoomAccountId());
                System.out.println(booking4.getZoomMeetingRoom().getZoomDeviceId());
            }
        }
    }
}
