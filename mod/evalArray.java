
/**
 * Write a description of class evalArray here.
 *
 * @author (Thomas Andrew)
 * @version (111919)
 */
import java.util.*;
public class evalArray
{
    public static void findMean(int[][] thisArr){
        int mean = 0;
        for(int l = 0; l < thisArr.length-1; l++){
            for(int j = 0; j < thisArr[l].length-1; j++){
                mean += thisArr[l][j];
                System.out.print(thisArr[l][j] + " ");
            }
            mean = mean / thisArr.length;
            System.out.println("|| Mean of row " + l + ": " + mean);
            System.out.println("");
        }
    }

    public static String findMeanTotal(int[][] thisArr){
        int mean = 0;
        for(int l = 0; l < thisArr.length-1; l++){
            for(int j = 0; j < thisArr[l].length-1; j++){
                mean += thisArr[l][j];
            }
        }
        mean = mean / thisArr.length;
        return ("Mean of entire array: " + mean);
    }

    public static String findMedian(int[][] bruh){
        for(int b = 0; b < bruh.length-1; b++){
            for(int i = 0; i < bruh[b].length-1; i++){
                int l = bruh[b][i];
                int s = bruh[b][i]+1;
                if(l > s){
                    bruh[b][i] = s;
                    bruh[b][i+1] = l;
                }
                System.out.print(bruh[b][i] + " ");
                continue;
            }
            int median = bruh[b].length / 2;
            System.out.println("|| Median of this row is : " + bruh[b][median]);
        }
        return "";
    }
}
