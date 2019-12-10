
/**
 * Write a description of class LogicGates here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LogicGates
{
    public LogicGates(){}
    public boolean XOR(boolean a,boolean b){
        if(a == true){
            if(b == true){
                return false;
            }
        }
        if(a == false){
            if(b == true){
                return true;
            }
        }
        if(a == true){
            if(b == false){
                return true;
            }
        }
        return false;
    }
}
