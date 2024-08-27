package com.appsflyer.internal;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;

/* loaded from: classes.dex */
public abstract class AFi1hSDK extends Observable {
    final Runnable AFKeystoreWrapper;

    /* renamed from: d, reason: collision with root package name */
    public final String f8507d;

    /* renamed from: e, reason: collision with root package name */
    long f8508e;
    public final String values;
    public final Map<String, Object> AFInAppEventParameterName = new HashMap();
    public AFa1ySDK unregisterClient = AFa1ySDK.NOT_STARTED;

    /* renamed from: com.appsflyer.internal.AFi1hSDK$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass1 implements Observer {
        public AnonymousClass1() {
        }

        @Override // java.util.Observer
        public final void update(Observable observable, Object obj) {
            AFi1hSDK.this.AFKeystoreWrapper.run();
        }
    }

    /* loaded from: classes.dex */
    public enum AFa1ySDK {
        NOT_STARTED,
        STARTED,
        FINISHED
    }

    public AFi1hSDK(String str, String str2, Runnable runnable) {
        this.AFKeystoreWrapper = runnable;
        this.values = str2;
        this.f8507d = str;
    }

    public final void values() {
        this.AFInAppEventParameterName.put("source", this.values);
        this.AFInAppEventParameterName.put("type", this.f8507d);
        this.AFInAppEventParameterName.put("latency", Long.valueOf(System.currentTimeMillis() - this.f8508e));
        this.unregisterClient = AFa1ySDK.FINISHED;
        setChanged();
        notifyObservers();
    }

    public abstract void values(Context context);
}
