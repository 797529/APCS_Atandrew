
/**
 * this will build the 2d array for using later.
 *
 * @author (thomas andrew)
 * @version (111919)
 */
import java.util.*;
public class createArray
{
    public createArray()
    {
    }
    public static int[][] loadNewArr(int[][] newArr2d){
        Random rand = new Random();
        for(int i = 0; i < newArr2d.length-1;i++){
            for(int h = 0; h < newArr2d[i].length-1;h++){
                newArr2d[i][h] = rand.nextInt(10);
            }
        }
        return newArr2d;
    }
}
