import java.util.Scanner;

public class Trip {
    protected String TripCode, DriverName, LicensePlate;
    protected double Revenue;
    Scanner in = new Scanner(System.in);

    protected void setRideCode(String tripCode) {
        TripCode = tripCode;
    }

    protected String getTripCode() {
        return TripCode;
    }

    protected void setDriverName(String driverName) {
        DriverName = driverName;
    }

    protected String getDriverName() {
        return DriverName;
    }

    protected void setLicensePlate(String licensePlate) {
        LicensePlate = licensePlate;
    }

    protected String getLicensePlate() {
        return LicensePlate;
    }

    protected void setRevenue(double revenue) {
        Revenue = revenue;
    }

    protected double getRevenue() {
        return Revenue;
    }

    protected Trip() {
        this.TripCode = "";
        this.DriverName = "";
        this.LicensePlate = "";
        this.Revenue = 0;
    }

    protected Trip(String tripCode, String driverName, String licensePlate, double revenue) {
        this.TripCode = tripCode;
        this.DriverName = driverName;
        this.LicensePlate = licensePlate;
        this.Revenue = revenue;
    }

    protected void nhap() {
        System.out.println("Nhap MaSo Chuyen: ");
        this.TripCode = in.nextLine();
        System.out.println("Ho Ten Tai Xe: ");
        this.DriverName = in.nextLine();
        System.out.println("So Xe: ");
        this.LicensePlate = in.nextLine();
        System.out.println("Doanh Thu: ");
        this.Revenue = in.nextDouble();
    }

    public String toString() {
        return "\nMS chuyen: " + this.TripCode + "\nName Tai Xe: " + this.DriverName
                + "\nSo Xe: " + this.LicensePlate;
    }
}
