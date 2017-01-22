import java.applet.Applet;
import java.applet.AudioClip;
import java.io.File;
import java.net.URL;

/**
 * Created by azhen on 17-1-22.
 */
public class PlayMusic extends Applet{
    public static void main(String[] args) throws Exception{
      /*  Applet applet = new Applet();
        URL url = new URL("file:///home/azhen/Music/good_morning.mp3");
        applet.play(url);*/
        Applet applet = new Applet();
        //URL url = new URL("file:///home/azhen/Music/??.wav");
        //URL url = new URL("file:///home/azhen/Music/good_morning.mp3");
        File file = new File("/home/azhen/Music/??.wav");
        URL url = file.toURI().toURL();
        AudioClip audioClip = Applet.newAudioClip(url);
        audioClip.play();
    }
}
