import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        int[] numbersArray = { 60, -10, 30, 45, 12};
//
//      for (int i = 0; i < numbersArray.length ; i++) {
//          System.out.print(numbersArray[i] + ", ");
//      }

//    String[] names = {"shimrit", "menashe", "aya", "rotem"};
//        System.out.println(names.length);

//    String[] cars = {"mazda", "nissan", "bmw", "volvo", "suzuki", "ionic"};
//
//        System.out.println(cars.length);
//
//
//
////        System.out.println(cars[1]); //mazda
//     for (int index = 0; index < cars.length; index++) {
//         System.out.println(cars[index]);
//
//     }

//        int[] grades = {55, 60, 78, 90, 100};
//        System.out.println(grades[0]); //55



//
        //additiona way of creating an array
//        int[] grades = new int[6]; //create an array name: grades - with 3 elements;
//        grades[0] = 20;
//        grades[3] =10;
//        System.out.println(grades[3]);
//        System.out.println();
//        grades[2] = "test";

//        a way to access an element in an array
//        arrayName[index];
//        a way to enter a value to an element in an array
//        arrayName[index] = value;

        //lets breake it down:
//        int[] grades;         //declaring an array
//        grades = new int[5];  //creating an array and defining the size of the array
//        and in order to insert data to this array we will write:
//        grades[0] = 80;
//        grades[1] = 90;
//        grades[2] = 80;






//        System.out.println(grades[0]);
//        another example -String EXAMPLE
//        String[] cars = new String[3];

        //Example 4 (shkufit 27 )
//        int[] arr_numbers = {1,2,3,8,100};
//
//     for (int index = 0; index < arr_numbers.length; index++) {
//         arr_numbers[index]++;
//         System.out.println(arr_numbers[index]);
//     }


//        //Java Basic 08
//        //lets assign values to our arrays
//        int[] grades = new int[4];  /// array of 4 elements
////        for (int i =0; i < grades.length; i++) {
////            grades[i] = 5;   //populate
////            i can print the values the usual way:
////            System.out.println(grades[i]);  // 5, 5 ,5 ,5
//        }
//        System.out.println(Arrays.toString(grades));
//
//        //shkufit number 7
//        int[] arr_int = new int[4];
//     for (int i = 0; i < arr_int.length; i++) {
//         arr_int[i] = i;            //populates the elements of the array with numbers
//         System.out.println(arr_int[i]);
//     }



     //example 1 shkufit 8 -populate array with random numbers
//        Random r = new Random();
//     int[] arr_rnd = new int[10];
//        System.out.println("Lets print random numbers");
//     for (int i =0; i < arr_rnd.length; i++) {
//         arr_rnd[i] = r.nextInt(100) +1;
//         //lets make it simpler to understand with breaking it to 2 steps
//         System.out.println(arr_rnd[i]);
//     }
        //extra example - not from presentation - a scanner example
//        Scanner scan = new Scanner(System.in);
//        int[] arr_scannerInput = new int[6];
//
//        // the loop is responsible for to get input from the s\canner
//        // ad add the value to abhay
//        for (int i =0; i < arr_scannerInput.length; i++) {
//            int x = scan.nextInt();
//            arr_scannerInput[i] = x;
//            System.out.print(arr_scannerInput[i]);
//        }
//
//        // transfer everything to sting --> print the string
//        System.out.print(Arrays.toString(arr_scannerInput));
//
//        // go over the array of integers and print each array value by its index
//        for  (int i =0; i < arr_scannerInput.length; i++) {
//            System.out.print(arr_scannerInput[i]);
////        }
//        Random r = new Random();
//        float[] arr = new float[r.nextInt(100) +1];
//        System.out.println(arr.length);
//        //Targil kita shkufit 10
//        int[] arr = new int [20];
//       for(int i = 0; i < arr.length; i++) {
//           arr[i] = arr.length-i;
//       }
//       //this loop will print the array
//        for(int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }


//        Random ra = new Random();
//        int[] randArray = new int[10];
//        for (int i = 0; i < randArray.length; i++) {
//            randArray[i] = ra.nextInt(100) + 1;    //populate the array with random numbers
//            System.out.print(randArray[i] + ", ");
//        }
//        for (int i = 0; i < randArray.length; i++) {
//                        //prints the elements
//        }
//
//        Scanner scan = new Scanner(System.in);
//        int[] scannerArray = new int[5];
//        for (int i = 0; i < scannerArray.length; i++) {
//            scannerArray[i] = scan.nextInt();
//
//        }
//
//        for (int i = 0; i < scannerArray.length; i++) {
//            System.out.print(scannerArray[i]);
//        }















//     mentiond first examples such as cars we showed and graded array

        //Example 3 shkufit number 14
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter array size:");
        int classRoomStudentsNumber = scan.nextInt();

        int[] grades = new int[classRoomStudentsNumber]; //int []

        for (int i = 0; i < grades.length; i++) {
            System.out.println(String.format("Please enter grade #%d:", i + 1));
            grades[i] = scan.nextInt();
        }
        int sum =0;
        for(int i =0; i < grades.length; i++) {
            sum = sum + grades[i];
        }
        float avg = sum / grades.length;
        System.out.println("The average is: " + avg);



        //nested loops
        //shkufit 17
//        int weeks = 3;
//     int days = 7;
//        for (int i = 1; i <= weeks; i++) {
//            System.out.println("Week: " + i);
//
//            for (int j =1; j <= days; j++) {
//                System.out.println("Day: " + j);
//            }
//        }
    }
}