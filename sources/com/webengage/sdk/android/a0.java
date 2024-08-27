package com.webengage.sdk.android;

import android.app.Activity;
import android.content.Intent;
import com.webengage.sdk.android.Analytics;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.Queue;

/* loaded from: classes2.dex */
class a0 extends Analytics {

    /* renamed from: a, reason: collision with root package name */
    Queue<i0> f12233a;

    public a0(Queue<i0> queue) {
        this.f12233a = queue;
    }

    @Override // com.webengage.sdk.android.Analytics
    public f a() {
        return null;
    }

    @Override // com.webengage.sdk.android.Analytics
    public d0 b() {
        return null;
    }

    @Override // com.webengage.sdk.android.Analytics
    public e0 c() {
        return null;
    }

    @Override // com.webengage.sdk.android.Analytics
    public WeakReference<Activity> getActivity() {
        return null;
    }

    @Override // com.webengage.sdk.android.Analytics
    public void installed(Intent intent) {
        this.f12233a.add(new g(5, intent));
    }

    @Override // com.webengage.sdk.android.Analytics
    public void screenNavigated(String str) {
        screenNavigated(str, null);
    }

    @Override // com.webengage.sdk.android.Analytics
    public void setScreenData(Map<String, ? extends Object> map) {
        this.f12233a.add(new g(4, map));
    }

    @Override // com.webengage.sdk.android.Analytics
    public void start(Activity activity) {
        this.f12233a.add(new g(1, new WeakReference(activity)));
    }

    @Override // com.webengage.sdk.android.Analytics
    public void stop(Activity activity) {
        this.f12233a.add(new g(2, new WeakReference(activity)));
    }

    @Override // com.webengage.sdk.android.Analytics
    public void track(String str) {
        track(str, null, null);
    }

    @Override // com.webengage.sdk.android.Analytics
    public void trackSystem(String str, Map<String, ?> map, Map<String, ?> map2) {
        this.f12233a.add(new g(6, str, map, map2));
    }

    @Override // com.webengage.sdk.android.Analytics
    public void a(Object obj) {
    }

    @Override // com.webengage.sdk.android.Analytics
    public void b(Object obj) {
    }

    @Override // com.webengage.sdk.android.Analytics
    public void screenNavigated(String str, Map<String, ? extends Object> map) {
        this.f12233a.add(new g(3, str, map));
    }

    @Override // com.webengage.sdk.android.Analytics
    public void track(String str, Analytics.Options options) {
        track(str, null, options);
    }

    @Override // com.webengage.sdk.android.Analytics
    public void track(String str, Map<String, ? extends Object> map) {
        track(str, map, null);
    }

    @Override // com.webengage.sdk.android.Analytics
    public void track(String str, Map<String, ?> map, Analytics.Options options) {
        this.f12233a.add(new g(0, str, map, options));
    }
}
