import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner key = new Scanner(System.in);
        Random r = new Random();
        int randomInt;

        //Create list of 10 random integers from 1-50.
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for(int i = 1; i <= 10; i++){
            randomInt = 1 + r.nextInt(50);
            numbers.add(randomInt);
        }

        //Display list and ask user to input a number.
        System.out.println("Here is a list of numbers: " + numbers);
        System.out.println("Please enter a number between 1 and 50 and I will tell you if it is in the list: ");
        int userNumber = key.nextInt();

        //Search for user input number and report if it's in the list.
        int sum = 0;
        for(int number : numbers){
            if(number == userNumber){
                sum++;
            }
        }
        if(sum > 1){
            System.out.println(userNumber + " was found " + sum + " times.");
        }else if(sum == 1){
            System.out.println(userNumber + " was found " + sum + " time.");
        }else{
            System.out.println(userNumber + " was not found.");
        }

    }
}
