
/**
 * Write a description of class StudentRunner here.
 *
 * @author (Thomas Andrew)
 * @version (82119)
 */
import java.util.Scanner;
public class StudentRunner{
    public static void main(){
        Scanner stuAsk = new Scanner(System.in);
        String student = stuAsk.nextLine();
        Student stu1 = new Student("Foo", 1);
        
        Student stu2 = new Student("Bruh", 2);
        
        Student stu3 = new Student("Phil", 68432456);
        if(student.equalsIgnoreCase("Bruh")){
        System.out.println(stu2.getName() + ", student number " + stu2.getNumber());
        }
        else if(student.equalsIgnoreCase("Phil")){
        System.out.println(stu3.getName() + ", student number " + stu3.getNumber());
        }
        else if(student.equalsIgnoreCase("Foo")){
        System.out.println(stu1.getName() + ", student number " + stu1.getNumber());
        }
        else{System.out.println("Student not found!");
        }
    }
}
