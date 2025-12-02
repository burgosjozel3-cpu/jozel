
/**
 * Write a description of class jz4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class jz4
{
    public static void main(String[] args){
        int[] nums = {5,2,9,1,7};
        int smallest = nums[0];
        int largest = nums[0];
        
        for(int x :nums){
            if(x < smallest) smallest =x;
            if(x > largest) largest =x;
        }
        System.out.println("Smallest: " + smallest);
        System.out.println("Largest: " + largest);
        }
    }
