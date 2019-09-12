
/**
 * Write a description of class CalcRun here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CalcRun{
    public CalcRun(){
        
    }
    public static void main(){
        SimpleCalculator calcRun = new SimpleCalculator(5,5);
        System.out.println(calcRun.add());
        System.out.println(calcRun.subtract());
        System.out.println(calcRun.divide());
        System.out.println(calcRun.multiply());
    }
}
