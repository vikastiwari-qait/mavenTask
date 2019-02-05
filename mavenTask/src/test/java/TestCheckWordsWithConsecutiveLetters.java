import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class TestCheckWordsWithConsecutiveLetters{

    @Test
    public void testListWithNoExpectedWords(){
        ArrayList<String> inputWordsList =  new ArrayList<>();
        inputWordsList.add("one");
        inputWordsList.add("two");
        inputWordsList.add("four");
        checkWordswithConsecutiveLetters obj = new checkWordswithConsecutiveLetters();
        ArrayList<String> outputWordsList = obj.checkWordsWithConsecutiveLetters(inputWordsList);
        ArrayList<String> expectedWordsList = new ArrayList<String>();
        expectedWordsList.add("No Words with Consecutive Letters");
        assertEquals("Test Failed due to Mismatch",expectedWordsList, outputWordsList);
    }


}