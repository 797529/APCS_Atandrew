
/**
 * this eats up all your input then spits it into the person object, which is then sorted into names and put into an array list.
 *
 * @author (Thomas Andrew)
 * @version (10919)
 */
import java.util.*;
public class NameParser{
    public static void main(){
        Scanner kb = new Scanner(System.in);
        ArrayList<Person> cls = new ArrayList<Person>(10);
        int count = 0;
        String inputStr = "";
        String lastName = "";
        //if(str1 == str2)
        while(!lastName.equals("quit")){
            System.out.println("Enter a name or type \"quit\" to quit");
            lastName = kb.nextLine();
            if(lastName.equals("print names")){
                for(int i = 0; i < cls.size(); i++){
                    if(cls.get(i) != null){
                System.out.println(cls.get(i).returnFullName());
              }
             }
             continue;
            }
            Person fullnm = new Person(lastName);
            cls.add(fullnm);
            count+=1;
        }
    }
}
