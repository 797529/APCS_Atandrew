package MagpieActivityStarterCode.activity2;

/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:  
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 *          Handles responding to simple words and phrases 
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 */
public class Magpie2
{
    /**
     * Get a default greeting   
     * @return a greeting
     */
    public String getGreeting()
    {
        return "Hello, let's talk.";
    }
    
    /**
     * Gives a response to a user statement
     * 
     * @param statement
     *            the user statement
     * @return a response based on the rules given
     */
    public String getResponse(String statement)
    {
        String response = "";
        if (statement.indexOf("no") >= 0)
        {
            response = "Why so negative?";
        }
        else if (statement.indexOf("cat") >= 0 || statement.indexOf("dog") >= 0){
            response = "Tell me about your pet.";
          }
          else if (statement.indexOf("Mr.") >= 0 || statement.indexOf("Mrs.") >= 0){
            response = "Sounds like a nice teacher.";
          }
        else if (statement.indexOf("1989") >= 0 || statement.indexOf("tiananmen square massacre") >= 0 || statement.indexOf("June 5th, 1989") >= 0){
            response = "Nothing happened then. I love Xi Jinping! Hail the Chinese Government!";
          }
          else if (statement.indexOf("capitalism") >= 0 || statement.indexOf("communism") >= 0){
            response = "I don't care about your political views.";
            }
        else if (statement.indexOf("killed") >= 0 || statement.indexOf("crime") >= 0){
            response = "I swear it wasn't me I've already told you guys!";
            }
        else if (statement.indexOf("last night") >= 0 || statement.indexOf("yesterday") >= 0){
            response = "I was at home doing laundry and watching football all day I swear.";
            }
        else if (statement.indexOf("you?") >= 0){
            response = "No it wasn't me I swear! Please you have to believe me! Don't put me away!.";
            }
        else if (statement.indexOf("state") >= 0){
            if(statement.indexOf("capitals") >= 0){
                    response = "Then tell me them right now.";
           }
          }
        else if (statement.indexOf("mother") >= 0
                || statement.indexOf("father") >= 0
                || statement.indexOf("sister") >= 0
                || statement.indexOf("brother") >= 0)
        {
            response = "Tell me more about your family.";
        }
        else
        {
            response = getRandomResponse();
        }
        return response;
    }

    /**
     * Pick a default response to use if nothing else fits.
     * @return a non-committal string
     */
    private String getRandomResponse()
    {
        final int NUMBER_OF_RESPONSES = 4;
        double r = Math.random();
        int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
        String response = "";
        
        if (whichResponse == 0)
        {
            response = "Interesting, tell me more.";
        }
        else if (whichResponse == 1)
        {
            response = "Hmmm.";
        }
        else if (whichResponse == 2)
        {
            response = "Do you really think so?";
        }
        else if (whichResponse == 3)
        {
            response = "You don't say.";
        }

        return response;
    }
}
