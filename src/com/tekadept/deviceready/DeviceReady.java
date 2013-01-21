
package com.tekadept.deviceready;

import android.os.Bundle;
import org.apache.cordova.*;

public class DeviceReady extends DroidGap
{
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        super.loadUrl("file:///android_asset/www/index.html");
    }
}

