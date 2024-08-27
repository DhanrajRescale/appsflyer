package com.appsflyer.internal;

import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Handler;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class AFj1vSDK implements AFi1cSDK {
    private static final BitSet AFInAppEventType;
    private final Handler AFInAppEventParameterName;
    private final Object AFKeystoreWrapper;
    private final Map<AFi1dSDK, Map<String, Object>> AFLogger;
    private final Runnable afInfoLog;

    /* renamed from: d */
    private boolean f8521d;

    /* renamed from: e */
    private final Map<AFi1dSDK, AFi1dSDK> f8522e;
    private final Runnable force;
    private final Runnable registerClient;
    private boolean unregisterClient;
    private final SensorManager valueOf;
    private final ExecutorService values;

    /* renamed from: com.appsflyer.internal.AFj1vSDK$1 */
    /* loaded from: classes.dex */
    public class AnonymousClass1 implements Runnable {
        public AnonymousClass1() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (AFj1vSDK.this.AFKeystoreWrapper) {
                AFj1vSDK.this.AFKeystoreWrapper();
                AFj1vSDK.this.AFInAppEventParameterName.postDelayed(AFj1vSDK.this.force, 150L);
                AFj1vSDK.this.unregisterClient = true;
            }
        }
    }

    /* renamed from: com.appsflyer.internal.AFj1vSDK$2 */
    /* loaded from: classes.dex */
    public class AnonymousClass2 implements Runnable {
        public AnonymousClass2() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (AFj1vSDK.this.AFKeystoreWrapper) {
                try {
                    if (AFj1vSDK.this.unregisterClient) {
                        AFj1vSDK.this.AFInAppEventParameterName.removeCallbacks(AFj1vSDK.this.registerClient);
                        AFj1vSDK.this.AFInAppEventParameterName.removeCallbacks(AFj1vSDK.this.force);
                        AFj1vSDK.this.AFInAppEventType();
                        AFj1vSDK.this.unregisterClient = false;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    static {
        BitSet bitSet = new BitSet(6);
        AFInAppEventType = bitSet;
        bitSet.set(1);
        bitSet.set(2);
        bitSet.set(4);
    }

    private AFj1vSDK(@NonNull SensorManager sensorManager, Handler handler, ExecutorService executorService) {
        this.AFKeystoreWrapper = new Object();
        BitSet bitSet = AFInAppEventType;
        this.f8522e = new HashMap(bitSet.size());
        this.AFLogger = new ConcurrentHashMap(bitSet.size());
        this.registerClient = new Runnable() { // from class: com.appsflyer.internal.AFj1vSDK.1
            public AnonymousClass1() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                synchronized (AFj1vSDK.this.AFKeystoreWrapper) {
                    AFj1vSDK.this.AFKeystoreWrapper();
                    AFj1vSDK.this.AFInAppEventParameterName.postDelayed(AFj1vSDK.this.force, 150L);
                    AFj1vSDK.this.unregisterClient = true;
                }
            }
        };
        this.force = new o(this, 2);
        this.afInfoLog = new Runnable() { // from class: com.appsflyer.internal.AFj1vSDK.2
            public AnonymousClass2() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                synchronized (AFj1vSDK.this.AFKeystoreWrapper) {
                    try {
                        if (AFj1vSDK.this.unregisterClient) {
                            AFj1vSDK.this.AFInAppEventParameterName.removeCallbacks(AFj1vSDK.this.registerClient);
                            AFj1vSDK.this.AFInAppEventParameterName.removeCallbacks(AFj1vSDK.this.force);
                            AFj1vSDK.this.AFInAppEventType();
                            AFj1vSDK.this.unregisterClient = false;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        };
        this.valueOf = sensorManager;
        this.AFInAppEventParameterName = handler;
        this.values = executorService;
    }

    public /* synthetic */ void AFLogger() {
        synchronized (this.AFKeystoreWrapper) {
            this.AFInAppEventParameterName.post(new o(this, 1));
        }
    }

    @NonNull
    private List<Map<String, Object>> d() {
        synchronized (this.AFKeystoreWrapper) {
            try {
                Iterator<AFi1dSDK> it = this.f8522e.values().iterator();
                while (it.hasNext()) {
                    it.next().AFInAppEventType(this.AFLogger, true);
                }
                if (this.AFLogger.isEmpty()) {
                    return new CopyOnWriteArrayList(Collections.emptyList());
                }
                return new CopyOnWriteArrayList(this.AFLogger.values());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public /* synthetic */ void e() {
        try {
            for (Sensor sensor : this.valueOf.getSensorList(-1)) {
                if (valueOf(sensor.getType())) {
                    AFi1dSDK aFi1dSDK = new AFi1dSDK(sensor, this.values);
                    if (!this.f8522e.containsKey(aFi1dSDK)) {
                        this.f8522e.put(aFi1dSDK, aFi1dSDK);
                    }
                    this.valueOf.registerListener(this.f8522e.get(aFi1dSDK), sensor, 1, this.AFInAppEventParameterName);
                }
            }
        } catch (Throwable th2) {
            AFLogger.afErrorLogForExcManagerOnly("registerListeners error", th2);
        }
        this.f8521d = true;
    }

    @NonNull
    private List<Map<String, Object>> registerClient() {
        synchronized (this.AFKeystoreWrapper) {
            try {
                if (!this.f8522e.isEmpty() && this.f8521d) {
                    Iterator<AFi1dSDK> it = this.f8522e.values().iterator();
                    while (it.hasNext()) {
                        it.next().AFInAppEventType(this.AFLogger, false);
                    }
                }
                if (this.AFLogger.isEmpty()) {
                    return new CopyOnWriteArrayList(Collections.emptyList());
                }
                return new CopyOnWriteArrayList(this.AFLogger.values());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public /* synthetic */ void unregisterClient() {
        try {
            if (!this.f8522e.isEmpty()) {
                for (AFi1dSDK aFi1dSDK : this.f8522e.values()) {
                    this.valueOf.unregisterListener(aFi1dSDK);
                    aFi1dSDK.AFInAppEventType(this.AFLogger, true);
                }
            }
        } catch (Throwable th2) {
            AFLogger.afErrorLogForExcManagerOnly("error while unregistering listeners", th2);
        }
        this.f8521d = false;
    }

    private static boolean valueOf(int i10) {
        return i10 >= 0 && AFInAppEventType.get(i10);
    }

    @Override // com.appsflyer.internal.AFi1cSDK
    public final synchronized void AFInAppEventParameterName() {
        this.AFInAppEventParameterName.post(this.afInfoLog);
    }

    public final void AFInAppEventType() {
        this.AFInAppEventParameterName.post(new o(this, 0));
    }

    public final void AFKeystoreWrapper() {
        this.AFInAppEventParameterName.post(new o(this, 3));
    }

    @Override // com.appsflyer.internal.AFi1cSDK
    @NonNull
    public final Map<String, Object> valueOf() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        List<Map<String, Object>> registerClient = registerClient();
        if (!registerClient.isEmpty()) {
            concurrentHashMap.put("sensors", registerClient);
        } else {
            List<Map<String, Object>> d10 = d();
            if (!d10.isEmpty()) {
                concurrentHashMap.put("sensors", d10);
            }
        }
        return concurrentHashMap;
    }

    @Override // com.appsflyer.internal.AFi1cSDK
    public final void values() {
        this.AFInAppEventParameterName.post(this.afInfoLog);
        this.AFInAppEventParameterName.post(this.registerClient);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AFj1vSDK(@androidx.annotation.NonNull android.content.Context r3, java.util.concurrent.ExecutorService r4) {
        /*
            r2 = this;
            android.content.Context r3 = r3.getApplicationContext()
            java.lang.String r0 = "sensor"
            java.lang.Object r3 = r3.getSystemService(r0)
            android.hardware.SensorManager r3 = (android.hardware.SensorManager) r3
            android.os.HandlerThread r0 = new android.os.HandlerThread
            java.lang.String r1 = "internal"
            r0.<init>(r1)
            r0.start()
            android.os.Handler r1 = new android.os.Handler
            android.os.Looper r0 = r0.getLooper()
            r1.<init>(r0)
            r2.<init>(r3, r1, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFj1vSDK.<init>(android.content.Context, java.util.concurrent.ExecutorService):void");
    }
}
