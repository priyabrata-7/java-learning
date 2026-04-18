public class s {
    int noOfwheel;
    int noOfdoor;
    int maxSpeed;
    String name;
    String modelNumber;
    String company;

    public s(int noOfwheel, int noOfdoor, int maxSpeed, String name, String modelNumber, String company) {
        this.noOfwheel = noOfwheel;
        this.noOfdoor = noOfdoor;
        this.maxSpeed = maxSpeed;
        this.name = name;
        this.modelNumber = modelNumber;
        this.company = company;


    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("s{");
        sb.append("noOfwheel=").append(noOfwheel);
        sb.append(", noOfdoor=").append(noOfdoor);
        sb.append(", maxSpeed=").append(maxSpeed);
        sb.append(", name='").append(name).append('\'');
        sb.append(", modelNumber='").append(modelNumber).append('\'');
        sb.append(", company='").append(company).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public static void main(String[] args) {
        s od = new s(4, 2, 170, "od01", "102", "ooo");
        System.out.println(od.toString());// agar me apne code me on ly object bhi call karun to bhi tostring method apne ap
        //call ho jega
    }
}