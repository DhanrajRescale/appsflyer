package com.webengage.sdk.android.actions.render;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;

/* loaded from: classes2.dex */
public class WebEngageActivity extends Activity {
    @Override // android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
    }

    @Override // android.app.Activity
    public void onRestart() {
        super.onRestart();
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        com.webengage.sdk.android.c.a(getApplicationContext()).start(this);
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        com.webengage.sdk.android.c.a(getApplicationContext()).stop(this);
    }
}
