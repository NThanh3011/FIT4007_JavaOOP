import java.util.Scanner;
class CityTrip extends Trip
{
    private double Km;
    private String TripNumber;
    Scanner in = new Scanner(System.in);
    public CityTrip()
    {
        super();
        this.TripNumber="";
        this.Km=0;
    }
    public CityTrip(String ma, String name, String sx, double dt, String st,
                    double skm)
    {
        super(ma, name, sx, dt);
        this.TripNumber=st;
        this.Km=skm;
    }
    public void setKm(double Km) {
        Km = Km;
    }
    public double getKm() {
        return Km;
    }
    public void setTripNumber(String tripNumber) {
        TripNumber = tripNumber;
    }
    public String getTripNumber() {
        return TripNumber;
    }
    public void nhap()
    {
        super.nhap();
        System.out.println("Nhap So Tuyen: ");
        this.TripNumber=in.nextLine();
        System.out.println("So Km: ");
        this.Km=in.nextDouble();
    }
    public String toString()
    {
        return "Chuyen Xe Noi Thanh " + super.toString()
                + "\n So Tuyen: " + this.TripNumber + "\nSo Km: " + this.Km
                + "\nDoanh Thu: " + this.Revenue;
    }
}
