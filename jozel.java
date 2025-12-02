
/**
 * Write a description of class jozel here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class jozel
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int num;
        
        do{
            System.out.print("Enter a number (1-100):");
            
            num = in.nextInt();
        }while(num < 1 || num > 100);
        
        System.out.println("Valid number: " + num);
        }
    }
