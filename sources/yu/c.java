package yu;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import qu.b0;
import qu.s2;
import vu.z;

/* loaded from: classes2.dex */
public final class c implements qu.h, s2 {

    /* renamed from: a, reason: collision with root package name */
    public final qu.i f41822a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f41823b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f41824c;

    public c(d dVar, qu.i iVar, Object obj) {
        this.f41824c = dVar;
        this.f41822a = iVar;
        this.f41823b = obj;
    }

    @Override // qu.h
    public final boolean D() {
        return this.f41822a.D();
    }

    @Override // qu.h
    public final void E(Object obj) {
        this.f41822a.E(obj);
    }

    @Override // qu.s2
    public final void a(z zVar, int i10) {
        this.f41822a.a(zVar, i10);
    }

    @Override // qu.h
    public final kp.g e(Object obj, Function1 function1) {
        d dVar = this.f41824c;
        b bVar = new b(dVar, this, 1);
        kp.g e10 = this.f41822a.e((Unit) obj, bVar);
        if (e10 != null) {
            d.f41825h.set(dVar, this.f41823b);
        }
        return e10;
    }

    @Override // yt.a
    public final CoroutineContext getContext() {
        return this.f41822a.f32216e;
    }

    @Override // qu.h
    public final void m(Function1 function1, Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d.f41825h;
        Object obj2 = this.f41823b;
        d dVar = this.f41824c;
        atomicReferenceFieldUpdater.set(dVar, obj2);
        b bVar = new b(dVar, this, 0);
        this.f41822a.m(bVar, (Unit) obj);
    }

    @Override // qu.h
    public final void q(b0 b0Var, Unit unit) {
        this.f41822a.q(b0Var, unit);
    }

    @Override // qu.h
    public final boolean r(Throwable th2) {
        return this.f41822a.r(th2);
    }

    @Override // yt.a
    public final void resumeWith(Object obj) {
        this.f41822a.resumeWith(obj);
    }
}
