
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
        String[] namearr = new String[10];
        int count = 0;
        String inputStr = "";
        String lastName = "";
        //if(str1 == str2)
        while(!lastName.equals("quit")){
            System.out.println("Enter a name or type \"quit\" to quit");
            lastName = kb.nextLine();
            if(lastName.equals("print names")){
                for(int i = 0; i < namearr.length; i++){
                System.out.println(namearr[i]);
              }
            }
            Person fullnm = new Person(lastName);
            System.out.println(fullnm);
            namearr[count] = lastName;
            count+=1;
        }
    }
}
