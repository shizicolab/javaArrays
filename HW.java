import java.util.Scanner;

public class HW {
    public static void main(String[] args) {
    //HW EXERCISE 1 shkufit 31 from Java Basic 07
        double[] my_arr = {0.9d, -6.5555d, 3.24, 10.11, 20.35};

        System.out.println("The first element: " + my_arr[0]);
        System.out.println("The last element: " + my_arr[4]);
        System.out.println("The middle element: " + my_arr[2]);
        System.out.println("\n" + "All the element in the array");
        //write a loop that prints all the values in that array
        for (int i =0; i <= my_arr.length-1; i++) {
            System.out.print("\n" + my_arr[i] + " ");
        }
        //write a loop that prints all the values in that array in reverse
        System.out.println("\n");
        for (int i = my_arr.length-1; i >= 0; i--) {
            System.out.print("\n" + my_arr[i] + " ");
        }
        //read a double number from user , print al the elements in the array which are bigger then the user-number
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter number: ");
        double num_d = scan.nextDouble();
        System.out.println("All the elements in the array which are " + "bigger than the user-number");
        for (int i =0; i <= my_arr.length-1; i++) {
            if(my_arr[i] > num_d) {
                System.out.println(my_arr[i] + " ");
            }
        }
        //HW EXERCISE 2 shkufit 32 from Java Basic 07
        int[] array_A = {4, 10, 20, 40, 1000};
        int[] array_B = {0, 0, 0, 0, 0};
        //copy all elements from array_A to array_B
        for (int i =0; i<=4; i++) {
            array_B[i] = array_A[i];
            System.out.println(array_B[i] + " "); //just to make sure all the elements was copied to array_B
        }
        ////HW EXERCISE 2 shkufit 32 from Java Basic 07 -
        //its etgar -were not solving it together - to whoever intersted the
        // solution is in the presentation
    }
}
