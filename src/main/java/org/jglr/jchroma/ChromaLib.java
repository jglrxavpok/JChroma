package org.jglr.jchroma;

import com.sun.jna.Library;
import com.sun.jna.Pointer;
import org.jglr.jchroma.devices.DeviceInfos;
import org.jglr.jchroma.devices.GUIDStruct;

/**
 * Wrapper used by JNA to load Razer Chroma SDK libraries.
 */
interface ChromaLib extends Library {

    int Init();
    int UnInit();
    int CreateKeyboardEffect(int type, Pointer param, Pointer effectID);
    int QueryDevice(GUIDStruct struct, DeviceInfos.DeviceInfosStruct infos);

}
