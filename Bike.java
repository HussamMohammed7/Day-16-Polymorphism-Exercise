public class Bike implements Vehicle{

    private String brand;
    private int hour;

    public Bike() {
    }

    public Bike(String brand, int hour) {
        this.brand = brand;
        this.hour = hour;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    @Override
    public double calculateRentalCost() {
        return hour * 10;
    }

    @Override
    public void displayDetails() {
        System.out.println("Bike Brand: "+getBrand());
        System.out.println("Hourly Rental Rate: $10.0 ");
        System.out.println("Rental Cost: "+calculateRentalCost());
    }
}
