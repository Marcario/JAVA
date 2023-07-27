

//type or datatype + variableName = value;
//datatypes are
//       String - stores text, such as "Hello". String values are surrounded by double quotes
//        int - stores integers (whole numbers), without decimals, such as 123 or -123
//        float - stores floating point numbers, with decimals, such as 19.99 or -19.99
//        char - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes
//        boolean - stores values with two states: true or false
//declaring a variable using a string
public class Variables {
  public static void main(String[]args){
      String name ="Tina";

//    Create a variable called myNum of type int and assign it the value 15:
      int myNum =15;
//      declare a variable without assigning the value, and assign the value later:
      int Num;
      Num =20;
//      To combine both text and a variable, use the + character
      String Name ="Christine";
// the + character to add a variable to another variable:
      String firstName ="Christine  ";
      String lastName ="Nalubwama";
      String fullName = firstName  +  lastName;

      System.out.println(name);
      System.out.println(myNum);
      System.out.println(Num);
      System.out.println("Hello " +  Name);
      System.out.println(fullName);
  }


}
