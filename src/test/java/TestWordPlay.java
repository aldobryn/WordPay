import com.dobryn.courcera.week1.WordPlay;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by adobryn on 20.12.2016.
 */
public class TestWordPlay
{
    @Test
    public void testIsVowel()
    {
        WordPlay obj = new WordPlay();
        assertEquals(obj.isVowel('a'), true);
        assertEquals(obj.isVowel('F'), false);
    }

    @Test
    public void testReplaceVowels()
    {
        WordPlay obj = new WordPlay();
        assertEquals(obj.replaceVowels("Hello world", '*'), "H*ll* w*rld");
    }

    @Test
    public void testEmphasize()
    {
        WordPlay obj = new WordPlay();
        assertEquals(obj.emphasize("dna ctgaaactga", 'a'), "dn* ctg+*+ctg+");
    }
}
