public class stringarr{
    public static void main(String[] args){
        String[] arr = new String[] {"ram", "hari ","radha","priya", "ritu"};
        StringBuilder sb = new StringBuilder();
        for (String s : arr) {
             sb.append(s).append(" ");

        }
         System.out.println(sb);
        }
    }
