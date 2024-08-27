package com.appsflyer.internal;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.os.Looper;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class AFi1dSDK implements SensorEventListener {
    private final int AFInAppEventParameterName;
    private double AFInAppEventType;

    @NonNull
    private final String AFKeystoreWrapper;

    @NonNull
    private final Executor AFLogger;

    /* renamed from: d, reason: collision with root package name */
    private long f8505d;

    @NonNull
    private final String valueOf;
    private final int values;
    private final float[][] registerClient = new float[2];

    /* renamed from: e, reason: collision with root package name */
    private final long[] f8506e = new long[2];

    public AFi1dSDK(Sensor sensor, @NonNull ExecutorService executorService) {
        int type = sensor.getType();
        this.values = type;
        String name = sensor.getName();
        String str = HttpUrl.FRAGMENT_ENCODE_SET;
        name = name == null ? HttpUrl.FRAGMENT_ENCODE_SET : name;
        this.AFKeystoreWrapper = name;
        String vendor = sensor.getVendor();
        str = vendor != null ? vendor : str;
        this.valueOf = str;
        this.AFInAppEventParameterName = str.hashCode() + ((name.hashCode() + ((type + 31) * 31)) * 31);
        this.AFLogger = executorService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: AFInAppEventParameterName, reason: merged with bridge method [inline-methods] */
    public void AFKeystoreWrapper(SensorEvent sensorEvent) {
        long j10 = sensorEvent.timestamp;
        float[] fArr = sensorEvent.values;
        long currentTimeMillis = System.currentTimeMillis();
        float[][] fArr2 = this.registerClient;
        float[] fArr3 = fArr2[0];
        if (fArr3 == null) {
            fArr2[0] = Arrays.copyOf(fArr, fArr.length);
            this.f8506e[0] = currentTimeMillis;
            return;
        }
        float[] fArr4 = fArr2[1];
        if (fArr4 == null) {
            float[] copyOf = Arrays.copyOf(fArr, fArr.length);
            this.registerClient[1] = copyOf;
            this.f8506e[1] = currentTimeMillis;
            this.AFInAppEventType = AFKeystoreWrapper(fArr3, copyOf);
            return;
        }
        if (50000000 <= j10 - this.f8505d) {
            this.f8505d = j10;
            if (Arrays.equals(fArr4, fArr)) {
                this.f8506e[1] = currentTimeMillis;
                return;
            }
            double AFKeystoreWrapper = AFKeystoreWrapper(fArr3, fArr);
            if (AFKeystoreWrapper > this.AFInAppEventType) {
                this.registerClient[1] = Arrays.copyOf(fArr, fArr.length);
                this.f8506e[1] = currentTimeMillis;
                this.AFInAppEventType = AFKeystoreWrapper;
            }
        }
    }

    private static double AFKeystoreWrapper(@NonNull float[] fArr, @NonNull float[] fArr2) {
        int min = Math.min(fArr.length, fArr2.length);
        double d10 = 0.0d;
        for (int i10 = 0; i10 < min; i10++) {
            d10 += StrictMath.pow(fArr[i10] - fArr2[i10], 2.0d);
        }
        return Math.sqrt(d10);
    }

    private boolean values(int i10, @NonNull String str, @NonNull String str2) {
        if (this.values == i10 && this.AFKeystoreWrapper.equals(str) && this.valueOf.equals(str2)) {
            return true;
        }
        return false;
    }

    public final void AFInAppEventType(@NonNull Map<AFi1dSDK, Map<String, Object>> map, boolean z10) {
        if (AFInAppEventParameterName()) {
            map.put(this, AFInAppEventType());
            if (z10) {
                int length = this.registerClient.length;
                for (int i10 = 0; i10 < length; i10++) {
                    this.registerClient[i10] = null;
                }
                int length2 = this.f8506e.length;
                for (int i11 = 0; i11 < length2; i11++) {
                    this.f8506e[i11] = 0;
                }
                this.AFInAppEventType = 0.0d;
                this.f8505d = 0L;
                return;
            }
            return;
        }
        if (map.containsKey(this)) {
            return;
        }
        map.put(this, AFInAppEventType());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AFi1dSDK) {
            AFi1dSDK aFi1dSDK = (AFi1dSDK) obj;
            return values(aFi1dSDK.values, aFi1dSDK.AFKeystoreWrapper, aFi1dSDK.valueOf);
        }
        return false;
    }

    public final int hashCode() {
        return this.AFInAppEventParameterName;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            this.AFLogger.execute(new h(1, this, sensorEvent));
        } else {
            AFKeystoreWrapper(sensorEvent);
        }
    }

    @NonNull
    private static List<Float> AFKeystoreWrapper(@NonNull float[] fArr) {
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f10 : fArr) {
            arrayList.add(Float.valueOf(f10));
        }
        return arrayList;
    }

    @NonNull
    private Map<String, Object> AFInAppEventType() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(7);
        concurrentHashMap.put("sT", Integer.valueOf(this.values));
        concurrentHashMap.put("sN", this.AFKeystoreWrapper);
        concurrentHashMap.put("sV", this.valueOf);
        float[] fArr = this.registerClient[0];
        if (fArr != null) {
            concurrentHashMap.put("sVS", AFKeystoreWrapper(fArr));
        }
        float[] fArr2 = this.registerClient[1];
        if (fArr2 != null) {
            concurrentHashMap.put("sVE", AFKeystoreWrapper(fArr2));
        }
        return concurrentHashMap;
    }

    private boolean AFInAppEventParameterName() {
        return this.registerClient[0] != null;
    }
}
