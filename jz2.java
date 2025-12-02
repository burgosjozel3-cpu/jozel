
/**
 * Write a description of class jz2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class jz2
{
    public static void main(String[] args){
        int[]arr = {7,3,7,1,5,7,8,9,2,7};
        int count = 0;
        
        for(int x : arr){
            if(x==7)count++;
        }
        
        System.out.println("7 appears " + count + "times.");
        }
    }
