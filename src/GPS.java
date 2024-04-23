public class GPS {
    private static GPS gps;

    private float latitude;
    private float longitude;

    private GPS() {
        // this.gps = gps;
    }

    public static GPS getInstance(){
        if(gps == null){
            gps = new GPS();
        }
        return gps;
    }

    public GPS getGps() {
        return gps;
    }

    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }
    
    
}
