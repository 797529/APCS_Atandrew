
/**
 * this eats up all your input then spits it into the person object, which is then sorted into names and put into an array list.
 *
 * @author (Thomas Andrew)
 * @version (10919)
 */
import java.util.*;
public class NameParser{
    public static void clear(){
        System.out.println('\u000c');
    }

    public static void main(){
        Scanner kb = new Scanner(System.in);
        ArrayList<Person> cls = new ArrayList<Person>(10);
        ArrayList<String> stuIDs = new ArrayList<String>(10);
        int count = 0;
        String stuGPA = "";
        String userinput = "";
        String studentID = "";
        String inputStr = "";
        String lastName = "";
        //if(str1 == str2)
        while(!userinput.equals("quit")){
            clear();
            System.out.println("Select an option below: \n1) Add Student \n2) Delete student\n3) Edit Student\n4) Reset List\n5) Print List\n6) Print Student\n7) Sort Student");
            userinput = kb.nextLine();
            if(userinput.equals("1")){
                System.out.println("Enter a name or type \"quit\" to quit");
                lastName = kb.nextLine();
                System.out.println("Type this student's ID:");
                studentID = kb.nextLine();
                stuIDs.add(studentID);
                Person fullnm = new Person(lastName);
                cls.add(fullnm);
                count+=1;
            }
            if(userinput.equals("6")){
                System.out.println("Enter the Student's ID: ");
                userinput = kb.nextLine();
                System.out.println(cls.get(stuIDs.indexOf(userinput)).returnFullName());
                userinput = kb.nextLine();
            }
            if(userinput.equals("2")){
                System.out.println("Enter the Student's ID: ");
                userinput = kb.nextLine();
                cls.set(stuIDs.indexOf(userinput),null);
                stuIDs.set(stuIDs.indexOf(userinput),null);
                userinput = kb.nextLine();
            }
            if(userinput.equals("3")){
                System.out.println("Enter the Student's ID: ");
                userinput = kb.nextLine();
                System.out.println("Enter the new name: ");
                inputStr = kb.nextLine();
                Person newname = new Person(inputStr);
                cls.set(stuIDs.indexOf(userinput),newname);
                System.out.println("Enter the new id: ");
                inputStr = kb.nextLine();
                stuIDs.set(stuIDs.indexOf(userinput),inputStr);
                userinput = kb.nextLine();
            }
            if(userinput.equals("4")){
                for(int i = 0; i < cls.size(); i++){
                    if(cls.get(i) != null){
                        cls.set(i,null);
                        stuIDs.set(i,null);
                    }
                }
                continue;
            }
            if(userinput.equals("5")){
                for(int i = 0; i < cls.size(); i++){
                    if(cls.get(i) != null){
                        System.out.println(cls.get(i).returnFullName() + " " + stuIDs.get(i));
                    }
                }
                kb.nextLine();
                continue;
            }
            if(userinput.equals("7")){
                for(int i = 0; i < cls.size(); i++){
                    if(cls.get(i) != null){

                    }
                }
                continue;
            }
        }
    }
}
