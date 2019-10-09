/*
 * Gurjit Singh
 * Monday October 7th - 2019
 * This program displays the choose your adventure text-based game
 */

package chooseyouradventure;
import java.util.Scanner;
/**
 *
 * @author gusin5788
 */
public class Chooseyouradventure {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String response1;
        String response2;
        String response3;
        
        System.out.println("Respond to each questions with capital letters.");
        System.out.println("Does the course involve Mathematics? Respond with (YES/NO).");
        response1 = input.nextLine();
        
        if (response1.equals ("YES")) {
            System.out.println("Are the course classes on the 1st floor, or 2nd and 3rd floor? Respond with (1ST FLOOR/2ND AND 3RD FLOOR).");
            response2 = input.nextLine();
            if (response2.equals ("1ST FLOOR")) {
                System.out.println("");
                System.out.println("The course is Mathematics.");
                System.out.println("");
            }
            else if (response2.equals ("2ND AND 3RD FLOOR")) {
                System.out.println("");
                System.out.println("The course is Science.");
                System.out.println("");
            }
        }
        else if (response1.equals ("NO")) {
            System.out.println("Are the course classes on the 1st floor, or 2nd floor, or 3rd floor? Respond with (1ST FLOOR/2ND FLOOR/3RD FLOOR).");
            response3 = input.nextLine();
            if (response3.equals ("1ST FLOOR")) {
                System.out.println("");
                System.out.println("The course is Geography.");
                System.out.println("");
            }
            else if (response3.equals ("2ND FLOOR")) {
                System.out.println("");
                System.out.println("The course if from the Arts Department.");
                System.out.println("");
            }
            else if (response3.equals ("3RD FLOOR")) {
                System.out.println("");
                System.out.println("The course if French, or English, or a course from the Computers Department.");
                System.out.println("");
            }
        }
        
    }
    
}
