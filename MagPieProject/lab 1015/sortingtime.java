
/**
 * Write a description of class sortingtime here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Arrays;
public class sortingtime
{
    public sortingtime(){
    }
    public int[] sorter(){
        int f = 0;
        int l = 0;
        int[] x = new int[]{10,5,8,3,2,9,4,7,6,1,11,16,14,13,15,12,20,19,17,18};
        int[] right = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        for(int i = 0; !Arrays.equals(x,right); i++){
        for(int b = 0; b < x.length-1;b++){
            f = x[b];
            l = x[b+1];
            if(f > l){
                x[b] = l;
                x[b+1] = f;
            }
            else{
                continue;
            }
            for(int s = 0; s < x.length; s++){
            System.out.print(x[s]);
            System.out.print(",");
           }
           System.out.println("");
        }
      }
      return null;
    }
    public static void main(){
    }
}
