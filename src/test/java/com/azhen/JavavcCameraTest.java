package com.azhen;

import org.bytedeco.javacv.CanvasFrame;
import org.bytedeco.javacv.OpenCVFrameGrabber;

import javax.swing.*;

/**
 * Created by azhen on 17-1-22.
 */
public class JavavcCameraTest {
    public static void main(String[] args) throws Exception, InterruptedException
    {
        OpenCVFrameGrabber grabber = new OpenCVFrameGrabber(0);
        grabber.start();   //?????????
        CanvasFrame canvas = new CanvasFrame("???");//??????
        canvas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        canvas.setAlwaysOnTop(true);

        while(true)
        {
            if(!canvas.isDisplayable())
            {//??????
                grabber.stop();//????
                System.exit(2);//??
            }
            canvas.showImage(grabber.grab());//???????????????? ???Frame frame=grabber.grab(); frame???????

            Thread.sleep(50);//50????????
        }
    }
}
