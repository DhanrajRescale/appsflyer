package com.webengage.sdk.android;

import android.app.Activity;
import android.content.Intent;
import com.webengage.sdk.android.utils.DataType;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class Analytics {

    /* loaded from: classes2.dex */
    public static class Options implements Serializable, com.webengage.sdk.android.utils.c {

        /* renamed from: a, reason: collision with root package name */
        private boolean f12124a = false;

        public boolean equals(Object obj) {
            return (obj instanceof Options) && ((Options) obj).getHighReportingPriority() == getHighReportingPriority();
        }

        public boolean getHighReportingPriority() {
            return this.f12124a;
        }

        public int hashCode() {
            return String.valueOf(this.f12124a).hashCode();
        }

        public Options setHighReportingPriority(boolean z10) {
            this.f12124a = z10;
            return this;
        }

        @Override // com.webengage.sdk.android.utils.c
        public Map<String, Object> toMap() {
            HashMap hashMap = new HashMap();
            hashMap.put("high_reporting_priority", Boolean.valueOf(this.f12124a));
            return hashMap;
        }

        public String toString() {
            try {
                return DataType.convert(toMap(), DataType.STRING, true).toString();
            } catch (Exception unused) {
                return null;
            }
        }
    }

    public abstract f a();

    public abstract void a(Object obj);

    public abstract d0 b();

    public abstract void b(Object obj);

    public abstract e0 c();

    public abstract WeakReference<Activity> getActivity();

    public abstract void installed(Intent intent);

    public abstract void screenNavigated(String str);

    public abstract void screenNavigated(String str, Map<String, ? extends Object> map);

    public abstract void setScreenData(Map<String, ? extends Object> map);

    public abstract void start(Activity activity);

    public abstract void stop(Activity activity);

    public abstract void track(String str);

    public abstract void track(String str, Options options);

    public abstract void track(String str, Map<String, ? extends Object> map);

    public abstract void track(String str, Map<String, ? extends Object> map, Options options);

    public abstract void trackSystem(String str, Map<String, ? extends Object> map, Map<String, ? extends Object> map2);
}
