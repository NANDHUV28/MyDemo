public class ZoomMeetingRoom extends MeetingRoom {
    private String zoomDeviceId;
    private String zoomAccountId;

    public ZoomMeetingRoom (String id, int capacity, int floor,String zoomDeviceId, String zoomAccountId) {
        super(id,capacity,floor);

        this.zoomDeviceId = zoomDeviceId;
        this.zoomAccountId = zoomAccountId;
    }

    public String getZoomDeviceId() {
        return zoomDeviceId;
    }
    public String getZoomAccountId() {
        return zoomAccountId;
    }
}
