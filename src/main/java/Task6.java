import java.util.ArrayList;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Task6 task6 = new Task6();
        task6.readData();

    }

    public void readData() {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        Scanner keyboard = new Scanner(System.in);
        System.out.println("enter an integer");
        try {
            while (true) {
                int myint;
                myint = keyboard.nextInt();
                arr.add(myint);
            }
        } catch (Exception e) {
            if (arr.isEmpty()) {
                System.out.println("no integer values inputed");
            } else {
                System.out.println(arr);
            }
            System.out.println("You input wrong type of value");
        }
    }
}

