package com.appsflyer.internal;

import java.util.TimerTask;

/* loaded from: classes.dex */
public final class AFf1xSDK extends TimerTask {
    private final Thread AFInAppEventType;

    public AFf1xSDK(Thread thread) {
        this.AFInAppEventType = thread;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        this.AFInAppEventType.interrupt();
    }
}
