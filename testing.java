package in.kgcoding;

public class testing {
    public static void main(String[] args){
        car obj = new car();
        obj.color= "red";
        obj.model="swift";
        System.out.println(obj);
        car car = new car("read","bmw",2,1000000);
        System.out.println(car);
    }
}
