
/**
 * Write a description of class Person here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Person
{
    public Person(String name){
        int divider = name.indexOf(" ");
        int firstdiv = name.indexOf(",");
        System.out.println("First Name : " + name.substring(0,divider));
        System.out.println("Last Name : " + name.substring(divider));
    }
}
