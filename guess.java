import java.util.Random;
import java.util.Scanner;
public class guess{

    static Random random = new Random();
    public static void main(String[] args){
    System.out.println("Enter Max Guessing Range: Default is 100");
        Scanner sc = new Scanner(System.in);
        int n = 100;
        String maxRange = sc.nextLine();
        try{
            n = Integer.parseInt(maxRange);
            }
        catch(Exception e){
            System.out.println("Invalid Input");
            }
        int key = random.nextInt(n+1),
        guess = -1;
        
        System.out.println("Guess a number between 0-" +(n) +"!");
        do
        {
            String temp = sc.nextLine();
            try{
                guess = Integer.parseInt(temp);
            }
            catch(Exception e){
                System.out.println("Invalid Guess");
            }
            if(guess > key){
                System.out.println("Too high!");
            }
            if(guess < key){
                System.out.println("too low.");
            }
            if(guess == key)
            break;

        }while(guess != key);
        sc.close();
        System.out.println("Congratulations " + key + " was the correct number!");
        
    }

}
