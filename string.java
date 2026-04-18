public class string{
    public static void main(String[]args){
        String name="lipu";
        int mark=10;
        System.out.println("the student name"+name+"mark scored"+mark);
        //ye har samay concardination karta hei jo ki  memory ko use bht karta hei isliye
        //memory ke better utililization keliye ham log use karte hein acess spacifier
        //java internally ham jab concardination karte hein kiya karta hei ek function hei stringbulder()
        //usko use karta hei jese ye jo line hei ye internally kese likha hota hei
        //newStringBulder()
        //.append("the student name")
        //.append("name")
        //.append("mark scored")
        //.append(mark)
        //.toString()
        // internally ye code likh ta hei java
        //iska singale line print me esa koi diffrence nehi hota
        //par ham jab loop use kate hein tab iska bada diffrence hota hei memory use keliye
        //isiliye is jaga ham printf agar use karenge wo better utlization of memory hoga

        System.out.printf(" the name of the student %s is scored mark %d",name,mark);

    }

}
/*
 string-->
  immutable in nature
  store in string constantpool
  not used in the threded enviroment as it is immutable
  comparably slowest
  stringbulder-->
    mutable in nature
    store in the heap
    not thred safe it used in a singale threded enviroment
    comparabily fastest
    string buffer-->
    mutable in nature
    it also store in the heap
    thread safe so it is used in multi threded enviroment
    fastest then the string but slower then the string bulder
 */