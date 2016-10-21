import com.sun.jna.*;
import com.sun.jna.ptr.PointerByReference;
import org.jglr.jchroma.JChroma;
import org.jglr.jchroma.effects.StaticKeyboardEffect;
import org.jglr.jchroma.effects.WaveDirection;
import org.jglr.jchroma.effects.WaveKeyboardEffect;
import org.jglr.jchroma.utils.ColorRef;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.awt.*;
import java.util.Arrays;
import java.util.List;

public class TestEffects {

    private JChroma chroma;

    @Before
    public void init() {
        chroma = JChroma.getInstance();
        chroma.init();
    }

    @After
    public void dispose() {
        chroma.free();
    }

    @Test
    public void staticEffect() {
        chroma.createKeyboardEffect(new StaticKeyboardEffect(new ColorRef(255, 128, 0)));
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testWave() {
        chroma.createKeyboardEffect(new WaveKeyboardEffect(WaveDirection.LEFT_TO_RIGHT));
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
