import org.junit.Assert;
import org.junit.Test;

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
        int frequency=myLinkedHashMap.get("not");
        System.out.println(myLinkedHashMap);
        Assert.assertEquals(1,frequency);
    }

}
