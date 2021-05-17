public class StringLength {
    public static int recLen(String str){
       if(str.equals(""))
      //  if(str.length()==0)
            return 0;
        else
            return recLen(str.substring(1)) + 1;
    }
    public static void main(String[] args) {
        String str="Vivek Gupta";
        System.out.println(recLen(str));//Calling the Function 
    }
}
