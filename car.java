package in.gattersetter;

public class car {
    private String color;//let i want this in public use ;
    private String model;//let i want this public use;
    private double fuel;
    private long costofpurches;//let i want deffult use
//  now the qustion is how to access this

    public car(String color, String model, double fuel,long costofpurpose) {
        this.color = color;
        this.model=model;
        this.fuel=fuel;
        this.costofpurches=costofpurpose;
    }
    public  String getColor(){
        return color;
    }
    public String getModel(){
        return model;
    }
    void setFuel(double fuel){
        this.fuel=fuel;
    }
}
