import static org.junit.Assert.*;
import junit.framework.*;

/**
 * Created by asuper on 2/19/16.
 */
public class TernaryTreeTest extends TestCase {
    public void testInsertAndGet() {
        TernaryTree<String> t = new TernaryTree<String>();
        t.insert("test", "test");
        t.insert("tester", "tester");
        t.insert("testa", "testa");
        t.insert("testz", "testz");
        t.insert("quack", "quack");
        assertEquals("test", t.get("test"));
        assertEquals("tester", t.get("tester"));
        assertEquals("testa", t.get("testa"));
        assertEquals("testz", t.get("testz"));
        assertEquals("quack", t.get("quack"));
    }

}