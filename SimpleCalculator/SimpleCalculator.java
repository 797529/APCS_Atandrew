
/**
 * Write a description of class SimpleCalculator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SimpleCalculator
{
    private int num1;
    private int num2;
    public SimpleCalculator(int x, int y){
        num1 = x;
        num2 = y;
    }
    public int add(){
        return num1+num2;
    }
    public int subtract(){
        return num1-num2;
    }
    public int divide(){
        return num1/num2;
    }
    public int multiply(){
        return num1*num2;
    }
    public int modDiv(){
        return num1%num2;
    }
}
