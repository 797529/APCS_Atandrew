
/**
 * Write a description of class Person here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Person
{
    String middlenm = "";
    String firstnm = "";
    String lname = "";
    public Person(String name){
        int midname = name.indexOf(" ");
        int lastname = name.lastIndexOf(" ");
        int lastfirst = name.indexOf(",");
        if (lastfirst == -1){
            if(midname != lastname){
                firstnm = name.substring(0,midname);
                middlenm = name.substring(midname,lastname);
                lname = name.substring(lastname);
            }
            else{
                firstnm = name.substring(0,lastname);
                lname = name.substring(lastname);
         }
        }
        else if(lastfirst != -1){
            if(midname != -1){
                firstnm = name.substring(lastfirst,lastname);
                middlenm = name.substring(lastname);
                lname = name.substring(0,lastfirst);
            }
            else{
            firstnm = name.substring(lastfirst);
            lname = name.substring(0,lastfirst);
           }
        }
    }
    public String returnFullName(){
        String fullNameFinished = firstnm + " " + middlenm + " " + lname;
        return fullNameFinished;
    }
    public String returnFirstName(){
        return firstnm;
    }
    public String returnMiddleName(){
        return middlenm;
    }
    public String returnLastName(){
        return lname;
    }
}
