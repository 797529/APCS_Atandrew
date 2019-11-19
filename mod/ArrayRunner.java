
/**
 * Write a description of class ArrayRunner here.
 *
 * @author (Thomas Andrew)
 * @version (111919)
 */
public class ArrayRunner
{
    public ArrayRunner()
    {
    }
    public static void main(){
        int[][] thisArr = new int[10][10];
        createArray.loadNewArr(thisArr);
        evalArray.findMean(thisArr);
        evalArray.findMedian(thisArr);
        System.out.println(evalArray.findMeanTotal(thisArr));
    }
}
