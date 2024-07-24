import java.time.*;
public class EmployeeBooking {
    public ZoomMeetingRoom zoomMeetingRoom;
    private String employeeId;
    private LocalDate mdate;
    private LocalTime mTime;
    private Duration duration;
    boolean ZoomFacility;
    private MeetingRoom meetingRoom;

    public EmployeeBooking(String employeeId, LocalDate mdate, LocalTime mTime, Duration duration,MeetingRoom meetingRoom) {
        this.employeeId = employeeId;
        this.mdate = mdate;
        this.mTime = mTime;
        this.duration = duration;
        this.meetingRoom = meetingRoom;
    }
    public EmployeeBooking(String employeeId, LocalDate mdate, LocalTime mTime, Duration duration,ZoomMeetingRoom zoomMeetingRoom) {
        this.employeeId = employeeId;
        this.ZoomFacility=true;
        this.mdate = mdate;
        this.mTime = mTime;
        this.duration = duration;
        this.zoomMeetingRoom = zoomMeetingRoom;
    }
    public String getEmployeeId() {
        return employeeId;
    }
    public LocalDate getDate() {
        return mdate;
    }
    public LocalTime getTime() {
        return mTime;
    }
    public Duration getDuration() {
        return duration;
    }
    public MeetingRoom getMeetingRoom() {
        return meetingRoom;
    }
    public ZoomMeetingRoom getZoomMeetingRoom(){
        return  zoomMeetingRoom;
    }
    public boolean getZoomFacilty(){
        return getZoomFacilty();
    }


}
