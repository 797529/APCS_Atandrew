
/**
 * Write a description of class NameParser here.
 *
 * @author (Thomas Andrew)
 * @version ()
 */
import java.util.*;
public class NameParser{
    public static void main(){
        Scanner kb = new Scanner(System.in);
        ArrayList<String> cls = new ArrayList<String>(10);
        String[] namearr = new String[10];
        int count = 0;
        String inputStr = "";
        int studnum = 0;
        String birthdate = "";
        String lastName = "";
        //if(str1 == str2)
        while(!lastName.equals("quit")){
            System.out.println("Enter a name or type \"quit\" to quit");
            lastName = kb.nextLine();
            if(lastName.equals("print names")){
                for(int i = 0; i < cls.size(); i++){
                    if(cls.get(i) != null){
                System.out.println(cls.get(i));
              }
             }
             continue;
            }
            Person fullnm = new Person(lastName);
            System.out.println(fullnm);
            cls.set(count,lastName);
            count+=1;
        }
    }
}
