package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.deeplink.DeepLinkResult;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class AFh1wSDK {
    public final AFd1qSDK AFInAppEventParameterName;
    public final Map<String, Object> AFInAppEventType;
    public final Map<String, Object> AFKeystoreWrapper;
    public final long[] AFLogger;

    /* renamed from: d, reason: collision with root package name */
    public final long[] f8501d;

    /* renamed from: e, reason: collision with root package name */
    public final long[] f8502e;

    /* renamed from: i, reason: collision with root package name */
    public long f8503i;
    public long registerClient;
    public long unregisterClient;

    /* renamed from: v, reason: collision with root package name */
    public long f8504v;
    public final Map<String, Object> valueOf;
    public long values;

    public AFh1wSDK(AFd1qSDK aFd1qSDK) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.AFKeystoreWrapper = concurrentHashMap;
        ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
        this.valueOf = concurrentHashMap2;
        ConcurrentHashMap concurrentHashMap3 = new ConcurrentHashMap();
        this.AFInAppEventType = concurrentHashMap3;
        this.values = 0L;
        this.unregisterClient = 0L;
        this.f8502e = new long[2];
        this.AFLogger = new long[2];
        this.f8501d = new long[2];
        this.registerClient = 0L;
        this.f8503i = 0L;
        this.AFInAppEventParameterName = aFd1qSDK;
        concurrentHashMap.putAll(AFKeystoreWrapper("first_launch"));
        concurrentHashMap2.putAll(AFKeystoreWrapper("ddl"));
        concurrentHashMap3.putAll(AFKeystoreWrapper("gcd"));
        this.f8504v = aFd1qSDK.values("prev_session_dur", 0L);
    }

    private Map<String, Object> AFKeystoreWrapper(String str) {
        Map<String, Object> emptyMap = Collections.emptyMap();
        String AFKeystoreWrapper = this.AFInAppEventParameterName.AFKeystoreWrapper(str, (String) null);
        if (AFKeystoreWrapper != null) {
            try {
                return AFa1oSDK.AFInAppEventType(new JSONObject(AFKeystoreWrapper));
            } catch (Exception e10) {
                AFLogger.afErrorLog("Error while parsing cached json data", e10, true);
                return emptyMap;
            }
        }
        return emptyMap;
    }

    public final void AFInAppEventParameterName(AFg1cSDK aFg1cSDK) {
        if (values()) {
            this.AFKeystoreWrapper.put("start_with", aFg1cSDK.toString());
            this.AFInAppEventParameterName.AFInAppEventParameterName("first_launch", new JSONObject(this.AFKeystoreWrapper).toString());
        }
    }

    public final void AFInAppEventType() {
        this.unregisterClient = System.currentTimeMillis();
        if (values()) {
            long j10 = this.values;
            if (j10 != 0) {
                this.AFKeystoreWrapper.put("init_to_fg", Long.valueOf(this.unregisterClient - j10));
                this.AFInAppEventParameterName.AFInAppEventParameterName("first_launch", new JSONObject(this.AFKeystoreWrapper).toString());
                return;
            }
            AFLogger.afInfoLog("Metrics: init ts is missing");
        }
    }

    public final void valueOf(int i10) {
        long currentTimeMillis = System.currentTimeMillis();
        long j10 = this.f8503i;
        if (j10 != 0) {
            this.AFInAppEventType.put("net", Long.valueOf(currentTimeMillis - j10));
        } else {
            AFLogger.afInfoLog("Metrics: gcdStart ts is missing");
        }
        this.AFInAppEventType.put("retries", Integer.valueOf(i10));
        this.AFInAppEventParameterName.AFInAppEventParameterName("gcd", new JSONObject(this.AFInAppEventType).toString());
    }

    public final void values(int i10) {
        long currentTimeMillis = System.currentTimeMillis();
        this.registerClient = currentTimeMillis;
        if (i10 == 1) {
            long j10 = this.unregisterClient;
            if (j10 != 0) {
                this.AFKeystoreWrapper.put("from_fg", Long.valueOf(currentTimeMillis - j10));
                this.AFInAppEventParameterName.AFInAppEventParameterName("first_launch", new JSONObject(this.AFKeystoreWrapper).toString());
                return;
            }
            AFLogger.afInfoLog("Metrics: fg ts is missing");
        }
    }

    public final void AFInAppEventParameterName(DeepLinkResult deepLinkResult, long j10) {
        this.valueOf.put("status", deepLinkResult.getStatus().toString());
        this.valueOf.put("timeout_value", Long.valueOf(j10));
        this.AFInAppEventParameterName.AFInAppEventParameterName("ddl", new JSONObject(this.valueOf).toString());
    }

    public final boolean values() {
        return this.AFInAppEventParameterName.valueOf("appsFlyerCount", 0) == 0;
    }
}
