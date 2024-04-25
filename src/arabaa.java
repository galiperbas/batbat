public class arabaa extends motorrr{
    String sahibi;
    public arabaa(String model, int year, String color, String sahibi){
        super(model,year, color); //important usage!
        this.sahibi = sahibi;


    }
    public static String instanceOfMotor(arabaa obj1){
        if (obj1 instanceof motorrr){
            return "evet";
        }
        else return "hayır";
    }



}
