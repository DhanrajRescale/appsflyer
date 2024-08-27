package com.webengage.sdk.android.actions.database;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public class r {

    /* renamed from: a, reason: collision with root package name */
    private static AtomicBoolean f12291a = new AtomicBoolean(true);

    /* renamed from: b, reason: collision with root package name */
    private static AtomicBoolean f12292b = new AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    private AtomicBoolean f12293c = new AtomicBoolean(true);

    /* renamed from: d, reason: collision with root package name */
    private AtomicInteger f12294d = new AtomicInteger(0);

    public static void c(boolean z10) {
        f12291a.set(z10);
    }

    public static boolean d() {
        return f12291a.get();
    }

    public void a(boolean z10) {
        this.f12293c.set(z10);
    }

    public int b() {
        return this.f12294d.get();
    }

    public void e() {
        this.f12294d.incrementAndGet();
    }

    public void f() {
        this.f12294d.set(0);
    }

    public static void b(boolean z10) {
        f12292b.set(z10);
    }

    public static boolean c() {
        return f12292b.get();
    }

    public boolean a() {
        return this.f12293c.get();
    }
}
