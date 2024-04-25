public class Testing {
    public static void main(String[] args) {
        arabaa araba1 = new arabaa("ford", 2014, "white", "Galip");
        arabaa araba2 = new arabaa("clio", 2003, "blue", "ömer");

        //instanceof
        System.out.println(arabaa.instanceOfMotor(araba1));
    }
}
