public class motorrr {
    protected String model;
     protected int  year;
    protected String color;

    public motorrr(String model, int year, String color) {
        this.model = model;
        this.year = year;
        this.color = color;


    }

    public String brake() {
        return "motor stopped";
    }

    public String noise() {

        return "vutututut";
    }
}
