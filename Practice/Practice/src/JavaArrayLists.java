import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;

//. Write a Java program to create an array list, add some
// colors (strings) and print out the collection
public class JavaArrayLists {
    public static  void main (String[]args){
        ArrayList<String>colors =new ArrayList<String>();

        colors.add ("Red");
        colors.add ("Orange");
        colors.add ("Blue");
        colors.add ("Green");
        colors.add ("Pink");

        System.out.println(colors);

//        Write a Java program to iterate through all
//        elements in an array list.
        for (String color:colors
             ) {
            System.out.println(color);
        }
        //        Write a Java program to insert an element into
//        the array list at the first position.
        colors.add(0,"white");
        System.out.println(colors);


//        Write a Java program to retrieve an element (at a specified index)
//        from a given array list.-removing an element
        colors.get(3);
        System.out.println(colors);

//        Write a Java program to remove the third element
//        from an array list.
        colors.remove(2);
        System.out.println(colors);

//        Write a Java program to search for an element in an array list.
        boolean Search = colors.contains("Pink");
        System.out.println(Search);

//        Write a Java program to sort a given array list
        Collections.sort(colors);
        System.out.println(colors);


        //    Write a Java program to copy one array list into another.
        ArrayList<String>colorcopy =new ArrayList<String>();

        colorcopy.add("A");
        colorcopy.add("B");
        colorcopy.add("C");
        colorcopy.add("D");
        colorcopy.add("E");
        Collections.copy(colorcopy,colors);
        System.out.println(colors);
        System.out.println(colorcopy);


//        Write a Java program to reverse elements in an array list.
        ArrayList<String> list_Strings = new ArrayList<String>();
        list_Strings.add("Red");
        list_Strings.add("Green");
        list_Strings.add("Orange");
        list_Strings.add("White");
        list_Strings.add("Black");
        System.out.println("List before reversing :\n" + list_Strings);
        Collections.reverse(list_Strings);
        System.out.println("List after reversing :\n" + list_Strings);
    }



}
