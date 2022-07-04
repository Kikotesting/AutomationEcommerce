/*
package CustomScripts;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.nio.file.Paths;

public class Screenshot {
    WebDriver browser;
    // Taking an element screenshot
    WebElement element = browser.findElement(By.xpath(""));
    File screenshotFile =
            ((TakesScreenshot)browser).getScreenshotAs(OutputType.FILE);
    BufferedImage fullImg = ImageIO.read(screenshotFile);
    Point point = element.getLocation();
    int elementWidth = element.getSize().getWidth();
    int elementHeight = element.getSize().getHeight();
    BufferedImage eleScreenshot = fullImg.getSubimage(point.getX(),
            point.getY(), elementWidth, elementHeight);
    ImageIO.write(eleScreenshot, screenshotFile);
        String tempDir = getProperty("java.io.tmpdir");
        File destFile = new File(Paths.get(tempDir, fileName + ".png").toString());
        FileUtils.getFileUtils().copyFile(screenshotFile, destFile);
}
*/
