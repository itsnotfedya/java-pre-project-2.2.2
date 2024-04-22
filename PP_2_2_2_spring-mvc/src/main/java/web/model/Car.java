package web.model;

public class Car {
    private String automobile;
    private int year;
    private String colour;

    public Car() {
    }

    public Car(String automobile, int year, String colour) {
        this.automobile = automobile;
        this.year = year;
        this.colour = colour;
    }

    public String getAutomobile() {
        return automobile;
    }

    public void setAutomobile(String automobile) {
        this.automobile = automobile;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return getAutomobile() + " " + getYear() + " " + getColour();
    }
}
