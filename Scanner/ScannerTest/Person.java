
/**
 * Write a description of class Person here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Person
{
    public Person(String name){
        int midname = name.indexOf(" ");
        int lastname = name.lastIndexOf(" ");
        int lastfirst = name.indexOf(",");
        if (lastfirst == -1){
            if(midname != lastname){
                System.out.println("First Name : " + name.substring(0,midname));
                System.out.println("Middle Name : " + name.substring(midname,lastname));
                System.out.println("Last Name : " + name.substring(lastname));
            }
            else{
                System.out.println("First Name : " + name.substring(0,lastname));
                System.out.println("Last Name : " + name.substring(lastname));
         }

        }
        else if(lastfirst != -1){
            if(midname != -1){
                System.out.println("First Name : " + name.substring(lastfirst,lastname));
                System.out.println("Middle Name : " + name.substring(lastname));
                System.out.println("Last Name : " + name.substring(0,lastfirst));
            }
            else{
            System.out.println("First Name : " + name.substring(lastfirst));
            System.out.println("Last Name : " + name.substring(0,lastfirst));
           }
        }
    }
}
