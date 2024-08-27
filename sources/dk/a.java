package dk;

import h5.h;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public final class a implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final String f14402a;

    /* renamed from: b, reason: collision with root package name */
    public final b f14403b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f14404c;

    /* renamed from: d, reason: collision with root package name */
    public int f14405d;

    public a(String str, b bVar, boolean z10) {
        this.f14402a = str;
        this.f14403b = bVar;
        this.f14404c = z10;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final synchronized Thread newThread(Runnable runnable) {
        h hVar;
        hVar = new h(this, runnable, "glide-" + this.f14402a + "-thread-" + this.f14405d);
        this.f14405d = this.f14405d + 1;
        return hVar;
    }
}
