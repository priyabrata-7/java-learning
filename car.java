
public class car{
    int noOfwheel;
    int noOfdoor;
    int maxSpeed;
    String name;
    String modelNumber;
    String company;
    public car( int noOfwheel,int noOfdoor ,int maxSpeed,String name,String modelNumber,String company) {
        this. noOfwheel=noOfwheel;
        this. noOfdoor = noOfdoor;
        this. maxSpeed = maxSpeed;
        this. name = name;
        this. modelNumber=modelNumber;
        this. company=company;


    }

    @Override
    public String toString() {
        return "my car name is="    +  name +'\n'+
         "my car wheel="+noOfwheel;
    }

    public static void main(String[] args){
        car od = new car(4 ,2,170,"od01","102","ooo");
        System.out.println(od.toString());// agar me apne code me on ly object bhi call karun to bhi tostring method apne ap
        //call ho jega

    }

}