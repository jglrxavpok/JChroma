import com.sun.jna.*;
import com.sun.jna.ptr.PointerByReference;
import org.jglr.jchroma.JChroma;
import org.jglr.jchroma.effects.*;
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
    public void breathingColors() {
        chroma.createKeyboardEffect(new BreathingKeyboardEffect(BreathingType.TWO_COLORS, new ColorRef(255,0,0), new ColorRef(255,255,255)));
        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void breathingRandom() {
        chroma.createKeyboardEffect(new BreathingKeyboardEffect(BreathingType.RANDOM, ColorRef.NULL, ColorRef.NULL));
        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void reactive() {
        chroma.createKeyboardEffect(new ReactiveKeyboardEffect(EffectDuration.MEDIUM, new ColorRef(0, 255, 0)));
        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void spectrum() {
        chroma.createKeyboardEffect(new SpectrumCyclingKeyboardEffect());
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
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
