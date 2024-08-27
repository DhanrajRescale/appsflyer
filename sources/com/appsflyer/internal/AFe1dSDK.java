package com.appsflyer.internal;

import android.net.TrafficStats;
import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class AFe1dSDK<Result> implements Comparable<AFe1dSDK<?>>, Callable<AFe1bSDK> {
    private static final AtomicInteger unregisterClient = new AtomicInteger();

    @NonNull
    public final Set<AFf1zSDK> AFInAppEventParameterName;

    @NonNull
    public final AFf1zSDK AFInAppEventType;
    public volatile int AFKeystoreWrapper;
    private long AFLogger;

    /* renamed from: d, reason: collision with root package name */
    private Throwable f8426d;

    /* renamed from: e, reason: collision with root package name */
    private final int f8427e;

    /* renamed from: i, reason: collision with root package name */
    private boolean f8428i;
    private final String registerClient;

    @NonNull
    public final Set<AFf1zSDK> valueOf;
    public AFe1bSDK values;

    public AFe1dSDK(@NonNull AFf1zSDK aFf1zSDK, @NonNull AFf1zSDK[] aFf1zSDKArr, String str) {
        HashSet hashSet = new HashSet();
        this.valueOf = hashSet;
        this.AFInAppEventParameterName = new HashSet();
        int incrementAndGet = unregisterClient.incrementAndGet();
        this.f8427e = incrementAndGet;
        this.f8428i = false;
        this.AFKeystoreWrapper = 0;
        this.AFInAppEventType = aFf1zSDK;
        Collections.addAll(hashSet, aFf1zSDKArr);
        if (str != null) {
            this.registerClient = str;
        } else {
            this.registerClient = String.valueOf(incrementAndGet);
        }
    }

    public abstract long AFInAppEventParameterName();

    public void AFInAppEventParameterName(Throwable th2) {
    }

    public void AFInAppEventType() {
    }

    @NonNull
    public abstract AFe1bSDK AFKeystoreWrapper() throws Exception;

    @Override // java.util.concurrent.Callable
    /* renamed from: AFLogger, reason: merged with bridge method [inline-methods] */
    public final AFe1bSDK call() throws Exception {
        TrafficStats.setThreadStatsTag("AppsFlyer".hashCode());
        this.values = null;
        this.f8426d = null;
        long currentTimeMillis = System.currentTimeMillis();
        this.AFKeystoreWrapper++;
        try {
            AFe1bSDK AFKeystoreWrapper = AFKeystoreWrapper();
            this.values = AFKeystoreWrapper;
            return AFKeystoreWrapper;
        } finally {
        }
    }

    public final boolean d() {
        return this.f8428i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AFe1dSDK aFe1dSDK = (AFe1dSDK) obj;
        if (this.AFInAppEventType != aFe1dSDK.AFInAppEventType) {
            return false;
        }
        return this.registerClient.equals(aFe1dSDK.registerClient);
    }

    public final int hashCode() {
        return this.registerClient.hashCode() + (this.AFInAppEventType.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.AFInAppEventType);
        sb2.append("-");
        sb2.append(this.registerClient);
        String obj = sb2.toString();
        if (!String.valueOf(this.f8427e).equals(this.registerClient)) {
            StringBuilder r10 = da.e.r(obj, "-");
            r10.append(this.f8427e);
            return r10.toString();
        }
        return obj;
    }

    public final Throwable unregisterClient() {
        return this.f8426d;
    }

    public abstract boolean valueOf();

    public void values() {
        this.f8428i = true;
    }

    @Override // java.lang.Comparable
    /* renamed from: AFInAppEventType, reason: merged with bridge method [inline-methods] */
    public final int compareTo(AFe1dSDK<?> aFe1dSDK) {
        int i10 = this.AFInAppEventType.AFPurchaseDetails - aFe1dSDK.AFInAppEventType.AFPurchaseDetails;
        if (i10 != 0) {
            return i10;
        }
        if (this.registerClient.equals(aFe1dSDK.registerClient)) {
            return 0;
        }
        return this.f8427e - aFe1dSDK.f8427e;
    }
}
