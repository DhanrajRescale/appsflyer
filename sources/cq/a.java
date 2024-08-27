package cq;

import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public final class a implements ThreadFactory {

    /* renamed from: e, reason: collision with root package name */
    public static final ThreadFactory f13035e = Executors.defaultThreadFactory();

    /* renamed from: a, reason: collision with root package name */
    public final AtomicLong f13036a = new AtomicLong();

    /* renamed from: b, reason: collision with root package name */
    public final String f13037b;

    /* renamed from: c, reason: collision with root package name */
    public final int f13038c;

    /* renamed from: d, reason: collision with root package name */
    public final StrictMode.ThreadPolicy f13039d;

    public a(String str, int i10, StrictMode.ThreadPolicy threadPolicy) {
        this.f13037b = str;
        this.f13038c = i10;
        this.f13039d = threadPolicy;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = f13035e.newThread(new yk.h(15, this, runnable));
        newThread.setName(String.format(Locale.ROOT, "%s Thread #%d", this.f13037b, Long.valueOf(this.f13036a.getAndIncrement())));
        return newThread;
    }
}
