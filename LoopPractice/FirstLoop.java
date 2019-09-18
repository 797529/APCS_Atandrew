
/**
 * Write a description of class FirstLoop here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FirstLoop
{
    public FirstLoop()
    {
    }
    public static void main(){
        for(int a = 0; a <= 5; a++){
            for(int b = 1; b <= a; b++){
                System.out.print(a);
            }
            System.out.println();
        }
    }
}
