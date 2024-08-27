package pt;

import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class b extends at.k {

    /* renamed from: a, reason: collision with root package name */
    public final ft.d f31338a;

    /* renamed from: b, reason: collision with root package name */
    public final ct.a f31339b;

    /* renamed from: c, reason: collision with root package name */
    public final ft.d f31340c;

    /* renamed from: d, reason: collision with root package name */
    public final d f31341d;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f31342e;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, ct.a, ct.b] */
    /* JADX WARN: Type inference failed for: r1v0, types: [ft.d, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [ft.d, java.lang.Object, ct.b] */
    public b(d dVar) {
        this.f31341d = dVar;
        ?? obj = new Object();
        this.f31338a = obj;
        ?? obj2 = new Object();
        this.f31339b = obj2;
        ?? obj3 = new Object();
        this.f31340c = obj3;
        obj3.c(obj);
        obj3.c(obj2);
    }

    @Override // ct.b
    public final void a() {
        if (!this.f31342e) {
            this.f31342e = true;
            this.f31340c.a();
        }
    }

    @Override // at.k
    public final ct.b b(Runnable runnable) {
        if (this.f31342e) {
            return ft.c.f16242a;
        }
        return this.f31341d.e(runnable, 0L, TimeUnit.MILLISECONDS, this.f31338a);
    }

    @Override // at.k
    public final ct.b c(Runnable runnable, long j10, TimeUnit timeUnit) {
        if (this.f31342e) {
            return ft.c.f16242a;
        }
        return this.f31341d.e(runnable, j10, timeUnit, this.f31339b);
    }
}
