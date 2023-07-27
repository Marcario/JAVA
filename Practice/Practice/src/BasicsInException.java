public class BasicsInException {
    public static void main(String[]args){
//       try and catch
        try {
            //  Block of code to try
           int[] myNumbers={1,2,3};
        System.out.println(myNumbers[10]);
       }catch (Exception e){
            //  Block of code to handle errors
           System.out.println(e);
       }
    }
}
