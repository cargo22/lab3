import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListTests {

    @Test 
	public void testListFilter(){
        String[] inp = {"a", "b", "c", "d"};
        List<String> result = Arrays.asList(inp);
        List<String> test = result;
        StringChecker sc = new ListExamples();
        assertEquals(test, ListExamples.filter(result, sc));
	} 

    @Test 
	public void testListMerge(){
        String[] inp = {"a", "c", "e", "g"};
        List<String> result = Arrays.asList(inp);
        String[]inp2 = {"b","d","f","h"};
        List<String> test = Arrays.asList(inp2);
        String[] res = {"a", "b", "c", "d", "e", "f", "g" , "h"};
        List<String> asdf = Arrays.asList(res);
        assertEquals(asdf, ListExamples.merge(result, test));
	} 
}
