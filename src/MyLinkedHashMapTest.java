import org.junit.Assert;
import org.junit.Test;

/**
 * @author Mentalist
 *
 */
public class MyLinkedHashMapTest {
	
    @Test
    public void givenAParagraph_WhenWordsAreAddedToList_ShouldReturnWordFrequency()
    {
        String paragraph="Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations.";
        MyLinkedHashMap <String, Integer> myLinkedHashMap=new MyLinkedHashMap<>();
        String[] words=paragraph.toLowerCase().split(" ");
        for(String word: words) {
        	Integer value=myLinkedHashMap.get(word);
        	if(value==null)
        		value=1;
        	else
        		value++;
        	myLinkedHashMap.add(word,value);
        }
    }
        @Test
    	public void toRemoveAWordFromTheHashTable() {
    		String sentence = "Paranoids are not paranoid because they are paranoid but"
    				+ " because they keep putting themselves deliberately into paranoid "
    				+ "avoidable situations";
    		MyLinkedHashMap<String, Integer> myHashTable = new MyLinkedHashMap<>();
    		String[] words = sentence.toLowerCase().split(" ");
    		for(String word : words) {
    			Integer value =  myHashTable.get(word);
    			if(value == null)
    				value = 1;
    			else 
    				value = value + 1;
    			myHashTable.add(word, value);
    		}
    		String deletedWord = myHashTable.remove("avoidable");		
    		Assert.assertEquals("avoidable", deletedWord);
    	
    }

}
