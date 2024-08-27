package com.appsflyer.internal;

/* loaded from: classes.dex */
public class AFe1mSDK {
    public final long AFKeystoreWrapper;

    public AFe1mSDK(long j10) {
        this.AFKeystoreWrapper = j10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass() && this.AFKeystoreWrapper == ((AFe1mSDK) obj).AFKeystoreWrapper) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j10 = this.AFKeystoreWrapper;
        return (int) (j10 ^ (j10 >>> 32));
    }
}
