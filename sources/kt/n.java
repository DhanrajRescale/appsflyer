package kt;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class n extends at.a {

    /* renamed from: a, reason: collision with root package name */
    public final at.a f23521a;

    /* renamed from: b, reason: collision with root package name */
    public final long f23522b;

    /* renamed from: c, reason: collision with root package name */
    public final TimeUnit f23523c;

    /* renamed from: d, reason: collision with root package name */
    public final at.l f23524d;

    /* renamed from: e, reason: collision with root package name */
    public final at.a f23525e = null;

    public n(at.a aVar, long j10, TimeUnit timeUnit, at.l lVar) {
        this.f23521a = aVar;
        this.f23522b = j10;
        this.f23523c = timeUnit;
        this.f23524d = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, ct.a, ct.b] */
    @Override // at.a
    public final void b(at.b bVar) {
        ?? obj = new Object();
        bVar.c(obj);
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        obj.c(this.f23524d.c(new l.g(this, atomicBoolean, obj, bVar, 3), this.f23522b, this.f23523c));
        this.f23521a.a(new m(obj, atomicBoolean, bVar));
    }
}
