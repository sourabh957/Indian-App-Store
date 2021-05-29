package com.example.governmentapps;

public class appStyle {
    private String appName ;
    private int imageID;
    private String appUrl;

    public appStyle(String appName, int imageID, String appUrl) {
        this.appName = appName;
        this.imageID = imageID;
        this.appUrl = appUrl;
    }

    public String getAppUrl() {
        return appUrl;
    }

    public String getAppName() {
        return appName;
    }

    public int getImageID() {
        return imageID;
    }
}
