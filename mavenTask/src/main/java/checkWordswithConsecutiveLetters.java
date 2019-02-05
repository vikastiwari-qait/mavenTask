import java.util.ArrayList;;

public class checkWordswithConsecutiveLetters{
    
    public ArrayList<String> checkWordsWithConsecutiveLetters(ArrayList<String> listOfWords){

        ArrayList<String> listOfWordsWithConsecutiveLetters =  new ArrayList<String>();

        for(String word : listOfWords){
            for(int index = 0; index < word.length()-1; index++){
                if(word.charAt(index) == word.charAt(index+1)){
                    listOfWordsWithConsecutiveLetters.add(word);
                    break;
                }
            }
        }
        if(listOfWordsWithConsecutiveLetters.size() == 0){
            listOfWordsWithConsecutiveLetters.add("No Words with Consecutive Letters");
        }
        listOfWordsWithConsecutiveLetters.add("asdgd");
        return listOfWordsWithConsecutiveLetters;
    }
}