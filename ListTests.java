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
}
