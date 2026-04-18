public class student {
    int rno;
    int age;
   String name;
   public student(int rn ,int ag, String name ){
       this.age=ag;
       this.rno=rn;
       this.name=name;

   }
   @Override
     public String toString(){
       return "my age = "+ age+'\n'+
               " my name ="+name+'\n'+
               "my rno = "  +rno;
   }
    public static void main(String[] args){
       student st = new student (10,18 ,"priyabrat");
       System.out.println(st.toString());
    }
}