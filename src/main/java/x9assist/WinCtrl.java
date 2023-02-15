package x9assist;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Stack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;

public class WinCtrl {


    public void main() throws MalformedURLException, InterruptedException {

        String projPath = "C:\\Users\\ingle\\IdeaProjects\\WiniumCTRL\\";
        String appPath = projPath + "src\\main\\resources\\app\\x9assistJarZip412\\x9assist.jar";

        DesktopOptions dop = new DesktopOptions();
        dop.setApplicationPath(appPath);

        URL url = new URL("http://localhost:9999");

        WebDriver driver = new WiniumDriver(url, dop);

        Thread.sleep(2000);

        driver.findElement(By.className("SunAwtFrame")).click();

    }
}