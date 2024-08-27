package com.google.firebase.crashlytics.internal;

import android.util.Log;

/* loaded from: classes2.dex */
public class Logger {
    private int logLevel = 4;
    private final String tag;
    public static final String TAG = "FirebaseCrashlytics";
    static final Logger DEFAULT_LOGGER = new Logger(TAG);

    public Logger(String str) {
        this.tag = str;
    }

    private boolean canLog(int i10) {
        if (this.logLevel > i10 && !Log.isLoggable(this.tag, i10)) {
            return false;
        }
        return true;
    }

    public static Logger getLogger() {
        return DEFAULT_LOGGER;
    }

    public void d(String str, Throwable th2) {
        if (canLog(3)) {
            Log.d(this.tag, str, th2);
        }
    }

    public void e(String str, Throwable th2) {
        if (canLog(6)) {
            Log.e(this.tag, str, th2);
        }
    }

    public void i(String str, Throwable th2) {
        if (canLog(4)) {
            Log.i(this.tag, str, th2);
        }
    }

    public void log(int i10, String str) {
        log(i10, str, false);
    }

    public void v(String str, Throwable th2) {
        if (canLog(2)) {
            Log.v(this.tag, str, th2);
        }
    }

    public void w(String str, Throwable th2) {
        if (canLog(5)) {
            Log.w(this.tag, str, th2);
        }
    }

    public void log(int i10, String str, boolean z10) {
        if (z10 || canLog(i10)) {
            Log.println(i10, this.tag, str);
        }
    }

    public void d(String str) {
        d(str, null);
    }

    public void e(String str) {
        e(str, null);
    }

    public void i(String str) {
        i(str, null);
    }

    public void v(String str) {
        v(str, null);
    }

    public void w(String str) {
        w(str, null);
    }
}
