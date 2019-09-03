
/**
 * Write a description of class Student here.
 *
 * @author (Thomas Andrew)
 * @version (82119)
 */
public class Student
{
    private String stuName;
    private int stuNumber;
    public Student(String name, int num){
        stuName = name;
        stuNumber = num;
    }
    
    public String getName(){
        return stuName;
    }
    public int getNumber(){
        return stuNumber;
    }
}
