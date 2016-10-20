package org.jglr.jchroma;

import com.sun.jna.Library;
import com.sun.jna.Pointer;

/**
 * Wrapper used by JNA to load Razer Chroma SDK libraries.
 */
interface ChromaLib extends Library {

    int Init();
    int UnInit();
    int CreateKeyboardEffect(int type, Pointer param, Pointer effectID);

}
