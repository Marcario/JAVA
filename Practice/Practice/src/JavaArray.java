import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Arrays;
//Write a Java program to sort a numeric array and a string array.
public class JavaArray {
    public static void main(String[]args) {
        String[] name = {"tina", "emma", "glady"};
        int[] age = {22, 27, 22};
//sort or putting the array in ascending or descending order
        Arrays.sort(age);
        Arrays.sort(name);

        System.out.println(Arrays.toString(age));
        System.out.println(Arrays.toString(name));

//        Write a Java program to sum values of an array.
        int sum =0;
//        for each
        for (int a :age
             ) {
            sum += a;
            System.out.println(sum);

        }
//        or wen the broke of the for each is removed
        int my_array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum1 = 0;

        for (int i : my_array)
            sum1 += i;
        System.out.println("The sum is " + sum1);

        //    Write a Java program to print the following grid
        System.out.println( "- - - - - - - - - - ");
        System.out.println( "- - - - - - - - - - ");
        System.out.println( "- - - - - - - - - - ");
        System.out.println( "- - - - - - - - - - ");




    }

    }

