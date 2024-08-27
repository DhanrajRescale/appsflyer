package pt;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class n extends at.k {

    /* renamed from: b, reason: collision with root package name */
    public final m f31380b;

    /* renamed from: c, reason: collision with root package name */
    public final o f31381c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f31382d = new AtomicBoolean();

    /* renamed from: a, reason: collision with root package name */
    public final ct.a f31379a = new Object();

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, ct.a] */
    public n(m mVar) {
        o oVar;
        o oVar2;
        this.f31380b = mVar;
        if (mVar.f31375c.f13075b) {
            oVar2 = p.f31388g;
            this.f31381c = oVar2;
        }
        while (true) {
            if (!mVar.f31374b.isEmpty()) {
                oVar = (o) mVar.f31374b.poll();
                if (oVar != null) {
                    break;
                }
            } else {
                oVar = new o(mVar.f31378f);
                mVar.f31375c.c(oVar);
                break;
            }
        }
        oVar2 = oVar;
        this.f31381c = oVar2;
    }

    @Override // ct.b
    public final void a() {
        if (this.f31382d.compareAndSet(false, true)) {
            this.f31379a.a();
            m mVar = this.f31380b;
            mVar.getClass();
            long nanoTime = System.nanoTime() + mVar.f31373a;
            o oVar = this.f31381c;
            oVar.f31383c = nanoTime;
            mVar.f31374b.offer(oVar);
        }
    }

    @Override // at.k
    public final ct.b c(Runnable runnable, long j10, TimeUnit timeUnit) {
        if (this.f31379a.f13075b) {
            return ft.c.f16242a;
        }
        return this.f31381c.e(runnable, j10, timeUnit, this.f31379a);
    }
}
