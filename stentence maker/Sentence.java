
/**
 * @author (Thomas Andrew)
 * @version (092019)
 */
import java.util.Random;
public class Sentence{
    public Sentence(){
        
    }
    public static String randomPick(String[] wordarray){
        Random generator = new Random();
        int randomIndex = generator.nextInt(wordarray.length);
        return wordarray[randomIndex];
    }
    public static String makeSentence(){
        String[] nouns = {"cow","ceo of racism","dictator","fox","moon","extremist","egg","mortal","pizza","child","fetus","scum"};
        String[] adjectives = {"quick","ugly","racist","brown","lazy","bright","burnt","enslaved","dead","commie"};
        String[] verb = {"jumped","ran","died","got cooked","cooked","had fun"};
        String[] determiners = {"the","my","his","her","your","their","our"};
        String[] adverbs = {"quickly","happily","smoothly","terribly"};
        String[] prepositions = {"near","over","behind","next to","under"};
        String nounphrase = randomPick(determiners) +" " + randomPick(adjectives) + " " + randomPick(nouns);
        String verbphrase = randomPick(adverbs) + " " + randomPick(verb);
        String prepphase = randomPick(prepositions) + " " +randomPick(determiners)+ " " +randomPick(adjectives)+ " " +randomPick(nouns);
        String fullsentence = nounphrase + " " + verbphrase + " " + prepphase;
        return fullsentence;
    }
    public static void main(){
        System.out.println(makeSentence());
    }
}
