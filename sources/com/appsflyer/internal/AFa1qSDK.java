package com.appsflyer.internal;

import android.net.Uri;
import androidx.annotation.NonNull;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class AFa1qSDK {
    public Map<String, Object> AFInAppEventParameterName;
    protected final Map<String, Object> AFInAppEventType;
    public String AFKeystoreWrapper;
    public int AFLogger;

    /* renamed from: d, reason: collision with root package name */
    public String f8391d;

    /* renamed from: e, reason: collision with root package name */
    public String f8392e;
    private byte[] force;
    public String registerClient;
    public String unregisterClient;
    public String valueOf;
    public AppsFlyerRequestListener values;

    /* renamed from: w, reason: collision with root package name */
    private final boolean f8393w;

    public AFa1qSDK() {
        this(null, null, null);
    }

    public final Map<String, Object> AFInAppEventParameterName() {
        return this.AFInAppEventType;
    }

    public final AFa1qSDK AFInAppEventType(byte[] bArr) {
        this.force = bArr;
        return this;
    }

    public final byte[] AFKeystoreWrapper() {
        return this.force;
    }

    public boolean AFLogger() {
        return true;
    }

    public boolean d() {
        return true;
    }

    public boolean e() {
        return true;
    }

    public boolean unregisterClient() {
        return false;
    }

    public AFa1qSDK valueOf(String str) {
        this.registerClient = str;
        return this;
    }

    public abstract AFf1zSDK values();

    public AFa1qSDK(String str, String str2, Boolean bool) {
        this.AFInAppEventType = new HashMap();
        this.f8392e = str;
        this.registerClient = str2;
        this.f8393w = bool != null ? bool.booleanValue() : true;
    }

    public final boolean AFInAppEventType() {
        return this.f8392e == null && this.AFKeystoreWrapper == null;
    }

    public final AFa1qSDK AFKeystoreWrapper(String str, Object obj) {
        synchronized (this.AFInAppEventType) {
            this.AFInAppEventType.put(str, obj);
        }
        return this;
    }

    public final boolean valueOf() {
        return this.f8393w;
    }

    public final AFa1qSDK AFInAppEventType(int i10) {
        this.AFLogger = i10;
        synchronized (this.AFInAppEventType) {
            try {
                if (this.AFInAppEventType.containsKey("counter")) {
                    this.AFInAppEventType.put("counter", Integer.toString(i10));
                }
                if (this.AFInAppEventType.containsKey("launch_counter")) {
                    this.AFInAppEventType.put("launch_counter", Integer.toString(i10));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return this;
    }

    public final AFa1qSDK valueOf(Map<String, ?> map) {
        synchronized (map) {
            this.AFInAppEventType.putAll(map);
        }
        return this;
    }

    @NonNull
    public static String AFInAppEventType(String str) {
        String d10 = AFb1vSDK.AFKeystoreWrapper().AFInAppEventParameterName().AFInAppEventType().d();
        return d10 != null ? Uri.parse(str).buildUpon().appendQueryParameter(AppsFlyerProperties.CHANNEL, d10).build().toString() : str;
    }

    public static boolean AFInAppEventType(double d10) {
        if (d10 < 0.0d || d10 >= 1.0d) {
            return false;
        }
        if (d10 == 0.0d) {
            return true;
        }
        int i10 = (int) (1.0d / d10);
        if (i10 + 1 > 0) {
            return ((int) ((Math.random() * ((double) i10)) + 1.0d)) != i10;
        }
        throw new IllegalArgumentException("Unsupported max value");
    }
}
