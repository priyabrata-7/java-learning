import java.util.Scanner ;
public class Bankaccount {

    private int accno;
    private String accholder;
    private int bal;
    public Bankaccount(int accno, String accholder,int bal) {
        this.accno = accno;
        this.accholder=accholder;
        this.bal=bal;
    }
    public int deposit(int amount){
        if (amount>0){
            bal+=amount;
            return bal;
        } else{
            System.out.println("does not deposit");
            return bal;
        }
    }
    public int withdraw(int amount){
        if(amount<bal) {
            bal -= amount;
            return bal;
        } else{
            System.out.println("not enough money");
            return bal;
        }
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println(" enter the accno , name , bal");
         int accno = input.nextInt();
         input.nextLine();
         String accholder = input.nextLine();
         int bal = input.nextInt();
         Bankaccount obj = new Bankaccount( accno,  accholder,  bal);
        System.out.println(" enter deposit for deposit or enter withdraw for withdraw");
        String a = input.next();
         if(a.equals("deposite")){
          int ammount;
          System.out.println("enter the amoount want to deposit");
          ammount= input.nextInt();
           System.out.println (obj. deposit(ammount));
         }
         else{
             int ammount;
             System.out.println("enter the amoount want to withdraw");
             ammount= input.nextInt();
             System.out.println(obj.withdraw(ammount));

         }

    }








}
