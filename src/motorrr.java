public class motorrr {
    String model;
    int year;
    String color;
    public  motorrr(String model,int year,String color){
        this.color=color;
        this.year=year;
        this.model=model;


    }

    public String brake() {
        return "motor stopped";
    }

    public String noise() {

        return "vutututut";
    }
}
