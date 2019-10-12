public class Car {
    private String make;
    private String model;
    private String number;
    private String segment;
    private String color;
    private double minDrivingExperience;
    private int cost;

    Car (String make, String model, String number, String segment, String color, double minDrivingExperience, int cost){
        this.make = make;
        this.model = model;
        this.number = number;
        this.segment = segment;
        this.color = color;
        this.minDrivingExperience = minDrivingExperience;
        this.cost = cost;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public String getMake() {
        return make;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getMinDrivingExperience() {
        return minDrivingExperience;
    }

    public int getCost() {
        return cost;
    }
}
