
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
        String[] stuIDs = new String[10];
        int count = 0;
        String stuGPA = "";
        String userinput = "";
        String studentID = "";
        String inputStr = "";
        String lastName = "";
        //if(str1 == str2)
        while(!lastName.equals("quit")){
            System.out.println("Select an option below: \n1) Add Student \n2) Delete student\n3) Edit Student\n4) Reset List\n5) Print List\n6) Print Student\n7) Sort Student");
            userinput = kb.nextLine();
            if(userinput.equals("1")){
                System.out.println("Enter a name or type \"quit\" to quit");
                lastName = kb.nextLine();
                System.out.println("Type this student's ID:");
                studentID = kb.nextLine();
                stuIDs[count] = studentID;
                Person fullnm = new Person(lastName);
                cls.add(fullnm);
                count+=1;
            }
            if(userinput.equals("5")){
                    for(int i = 0; i < cls.size(); i++){
                        if(cls.get(i) != null){
                    System.out.println(cls.get(i).returnFullName() + " " + stuIDs[i]);
                  }
                 }
                 continue;
            }
        }
    }
}
