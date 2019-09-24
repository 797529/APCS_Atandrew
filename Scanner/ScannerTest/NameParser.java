
/**
 * Write a description of class NameParser here.
 *
 * @author (Thomas Andrew)
 * @version ()
 */
import java.util.Scanner;
public class NameParser{
    public static void main(){
        Scanner kb = new Scanner(System.in);
        String inputStr = "";
        String lastName = "";
        //if(str1 == str2)
        while(!lastName.equals("quit")){
            System.out.println("Enter a name or type \"quit\" to quit");
            lastName = kb.nextLine();
            Person fullnm = new Person(lastName);
            System.out.println(fullnm);
        }
    }
}
