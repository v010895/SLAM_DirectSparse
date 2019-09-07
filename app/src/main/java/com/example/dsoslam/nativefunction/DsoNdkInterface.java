package com.example.dsoslam.nativefunction;

public class DsoNdkInterface {
    public static native void initSystemWithParameters(String calibrationPath);
    public static native int[] runDsoSlam(int[] data_L, int[] data_R, int width, int height);
    public static native float[] getCurrentPose();
    public static native void insertFrame(double curTimeStamp,int[] data,int[] dataR,int w,int h);
    public static native void trackWithCombinedImage(byte[] data);
    public static native int[] trackRealTime();
    public native static void glesInit();
    public native static void glesRender();
    public native static void glesResize(int width, int height);

}
