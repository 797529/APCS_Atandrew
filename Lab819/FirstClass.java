
/**
 * Write a description of class FirstClass here.
 *
 * @author (Thomas Andrew)
 * @version (81919)
 */
public class FirstClass
{
    public FirstClass(){
    }
    public static int addemup(int a, int b){
        int x = a+b;
        return x;
    }
    public static int subtractMode(int a, int b){
        int x = a - b;
        return x;
    }
    public static int multiplyMode(int a, int b){
        int x = a * b;
        return x;
    }
    public static int divideMachine(int a,int b){
        int x = a / b;
        return x;
    }
    public static int greaterThan(int a,int b){
        if (a > b){
            return a;
        }
        else{
            return b;
        }
    }
    //takes in user numbers and runs them through all the different operations
    public static void main(int a, int b){
        System.out.println(addemup(a,b));
        System.out.println(subtractMode(a,b));
        System.out.println(multiplyMode(a,b));
        System.out.println(divideMachine(a,b));
        System.out.println("Between " + a + " and " + b + ", "+ greaterThan(a,b) + " is the bigger number.");
    }
}
