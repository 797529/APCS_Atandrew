
/**
 * Write a description of class MakeArray here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.lang.Math;
import java.util.Arrays;
public class MakeArray
{
    public MakeArray(){

    }
    public static double getMean(double[] nums){
        int l;
        double total;
        total = 0.0;
        for(l=0; l < nums.length ;l++){
            total += nums[l];
        }
        return total/nums.length;
    }
    public static double getMedian(double[] nums){
        Arrays.sort(nums);
        return 9.0;
    }
    public static void main(){
        double nums[];
        int i;
        nums = new double[10];
        for(i = 0; i < nums.length; i++){
            nums[i] = Math.random()*100;
        }
        System.out.println("Mean: " + getMean(nums));
    }
}
