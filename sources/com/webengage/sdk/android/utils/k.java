package com.webengage.sdk.android.utils;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes2.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    public static k f12929a = new k();

    /* renamed from: b, reason: collision with root package name */
    private ExecutorService f12930b = Executors.newSingleThreadExecutor();

    private k() {
    }

    public static k a() {
        return f12929a;
    }

    public void a(Runnable runnable) {
        this.f12930b.execute(runnable);
    }
}
