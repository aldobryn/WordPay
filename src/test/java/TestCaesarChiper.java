import com.dobryn.courcera.week1.CaesarCipher;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by adobryn on 20.12.2016.
 */
public class TestCaesarChiper
{
    @Test
    public void TestEncrypt()
    {
        CaesarCipher c = new CaesarCipher();
        assertEquals(c.encrypt("FIRST LEGION ATTACK EAST FLANK!", 23), "CFOPQ IBDFLK XQQXZH BXPQ CIXKH!");
        assertEquals(c.encrypt("First Legion", 17), "Wzijk Cvxzfe");
        assertEquals(c.encryptTwoKeys("First Legion", 23, 17), "Czojq Ivdzle");
    }
}
