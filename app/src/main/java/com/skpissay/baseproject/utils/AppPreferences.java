package com.skpissay.baseproject.utils;

import android.content.Context;

/**
 * Created by skpissay on 02/10/17.
 */

public class AppPreferences extends PreferenceHelper {
    public AppPreferences(Context context) {
        super(context);
    }

    public void setAccessToken(String accessToken) {
        this.addPreference("access_token", accessToken);
    }

    public String getAccessToken() {
        return this.getString("access_token", (String)null);
    }
}
