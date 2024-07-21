public class Car implements Vehicle {

    private int days ;
    private String model;


    public Car(){

    }
    public Car(int days, String model) {
        this.days = days;
        this.model = model;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public double calculateRentalCost() {
        return days * 50;
    }

    @Override
    public void displayDetails() {
        System.out.println("Car Model: "+getModel());
        System.out.println("Daily Rental Rate: $50.0 ");
        System.out.println("Rental Cost: "+calculateRentalCost());

    }
}
