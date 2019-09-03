
/**
 * Write a description of class FirstClass here.
 *
 * @author (Thomas Andrew)
 * @version (81519)
 */
public class FirstClass
{
    private static int x;
    public FirstClass()
    {
        
    }
    public static void name(String floor, int m){
        System.out.print("Hello " + floor + " the " + m + "rd.");
    }
    public static void main(){
        x = 3;
        name("Blees", x);
    }
}
