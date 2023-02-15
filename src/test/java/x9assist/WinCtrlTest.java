package x9assist;

import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class WinCtrlTest {

    @Test
    public void OpenX9assistJar() throws MalformedURLException, InterruptedException {

        WinCtrl winCtrl = new WinCtrl();

        winCtrl.main();
    }
}
