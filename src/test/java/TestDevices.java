import org.jglr.jchroma.JChroma;
import org.jglr.jchroma.devices.DeviceInfos;
import org.jglr.jchroma.devices.RazerDevices;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestDevices {

    private JChroma chroma;

    @Before
    public void init() {
        chroma = JChroma.getInstance();
        chroma.init();
    }

    @Test
    public void queryBlackwidow() {
        DeviceInfos deviceInfos = new DeviceInfos();
        chroma.queryDevice(RazerDevices.BLACKWIDOW_CHROMA, deviceInfos);
        System.out.println(deviceInfos.isConnected());
        System.out.println(deviceInfos.getType().name());

        System.out.println(chroma.isDeviceConnected(RazerDevices.BLACKWIDOW_CHROMA));

        System.out.println(chroma.isDeviceConnected(RazerDevices.DEATHSTALKER_CHROMA));
        System.out.println(chroma.queryDevice(RazerDevices.DEATHSTALKER_CHROMA).getType());

        System.out.println(chroma.queryDevice(RazerDevices.DEATHADDER_CHROMA).getType());
    }

    @After
    public void dispose() {
        chroma.free();
    }
}
