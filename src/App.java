public class App {
    public static void main(String[] args) throws Exception {
        GPS g1 = GPS.getInstance();
        g1.setLatitude(10f);
        g1.setLongitude(23f);

        System.out.println("GPS 1");
        System.out.println("Latitude: " + g1.getLatitude());
        System.out.println("Longitude: " + g1.getLongitude());

        GPS g2 = GPS.getInstance();
        System.out.println("GPS 2");
        System.out.println("Latitude: " + g2.getLatitude());
        System.out.println("Longitude: " + g2.getLongitude());
      
    }
}
