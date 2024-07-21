public class Truck implements Vehicle{

    private String type ;
    private int weeks;


    public Truck() {
    }

    public Truck(String type, int weeks) {
        this.type = type;
        this.weeks = weeks;
    }




    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getWeeks() {
        return weeks;
    }

    public void setWeeks(int weeks) {
        this.weeks = weeks;
    }

    @Override
    public void displayDetails() {
        System.out.println("Truck Type: "+getType());
        System.out.println("Weekly Rental Rate: $500.0 ");
        System.out.println("Rental Cost: "+calculateRentalCost());
    }

    public double calculateRentalCost() {
        return weeks * 500;
    }



}
