package su;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import qu.s2;
import ut.l;
import vu.a0;
import vu.z;

/* loaded from: classes2.dex */
public final class b implements s2 {

    /* renamed from: a, reason: collision with root package name */
    public Object f34780a = e.f34810p;

    /* renamed from: b, reason: collision with root package name */
    public qu.i f34781b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f34782c;

    public b(c cVar) {
        this.f34782c = cVar;
    }

    @Override // qu.s2
    public final void a(z zVar, int i10) {
        qu.i iVar = this.f34781b;
        if (iVar != null) {
            iVar.a(zVar, i10);
        }
    }

    public final Object b(au.c frame) {
        k kVar;
        qu.i iVar;
        Boolean bool;
        k kVar2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c.f34788h;
        c cVar = this.f34782c;
        k kVar3 = (k) atomicReferenceFieldUpdater.get(cVar);
        while (true) {
            cVar.getClass();
            if (cVar.v(c.f34783c.get(cVar), true)) {
                this.f34780a = e.f34806l;
                Throwable q10 = cVar.q();
                if (q10 == null) {
                    return Boolean.FALSE;
                }
                int i10 = a0.f38355a;
                throw q10;
            }
            long andIncrement = c.f34784d.getAndIncrement(cVar);
            long j10 = e.f34796b;
            long j11 = andIncrement / j10;
            int i11 = (int) (andIncrement % j10);
            if (kVar3.f38412c != j11) {
                k p10 = cVar.p(j11, kVar3);
                if (p10 == null) {
                    continue;
                } else {
                    kVar = p10;
                }
            } else {
                kVar = kVar3;
            }
            Object D = cVar.D(kVar, i11, andIncrement, null);
            kp.g gVar = e.f34807m;
            if (D != gVar) {
                kp.g gVar2 = e.f34809o;
                if (D == gVar2) {
                    if (andIncrement < cVar.t()) {
                        kVar.a();
                    }
                    kVar3 = kVar;
                } else if (D == e.f34808n) {
                    c cVar2 = this.f34782c;
                    qu.i A = yk.g.A(zt.f.b(frame));
                    try {
                        this.f34781b = A;
                        iVar = A;
                        try {
                            Object D2 = cVar2.D(kVar, i11, andIncrement, this);
                            if (D2 == gVar) {
                                a(kVar, i11);
                            } else {
                                rb.f fVar = null;
                                CoroutineContext coroutineContext = iVar.f32216e;
                                Function1 function1 = cVar2.f34793b;
                                if (D2 == gVar2) {
                                    if (andIncrement < cVar2.t()) {
                                        kVar.a();
                                    }
                                    k kVar4 = (k) c.f34788h.get(cVar2);
                                    while (true) {
                                        if (cVar2.v(c.f34783c.get(cVar2), true)) {
                                            qu.i iVar2 = this.f34781b;
                                            Intrinsics.c(iVar2);
                                            this.f34781b = null;
                                            this.f34780a = e.f34806l;
                                            Throwable q11 = cVar.q();
                                            if (q11 == null) {
                                                l.Companion companion = ut.l.INSTANCE;
                                                iVar2.resumeWith(Boolean.FALSE);
                                            } else {
                                                l.Companion companion2 = ut.l.INSTANCE;
                                                iVar2.resumeWith(ut.n.a(q11));
                                            }
                                        } else {
                                            long andIncrement2 = c.f34784d.getAndIncrement(cVar2);
                                            long j12 = e.f34796b;
                                            long j13 = andIncrement2 / j12;
                                            int i12 = (int) (andIncrement2 % j12);
                                            if (kVar4.f38412c != j13) {
                                                k p11 = cVar2.p(j13, kVar4);
                                                if (p11 != null) {
                                                    kVar2 = p11;
                                                }
                                            } else {
                                                kVar2 = kVar4;
                                            }
                                            Function1 function12 = function1;
                                            Object D3 = cVar2.D(kVar2, i12, andIncrement2, this);
                                            if (D3 == e.f34807m) {
                                                a(kVar2, i12);
                                                break;
                                            }
                                            if (D3 == e.f34809o) {
                                                if (andIncrement2 < cVar2.t()) {
                                                    kVar2.a();
                                                }
                                                function1 = function12;
                                                kVar4 = kVar2;
                                            } else if (D3 != e.f34808n) {
                                                kVar2.a();
                                                this.f34780a = D3;
                                                this.f34781b = null;
                                                bool = Boolean.TRUE;
                                                if (function12 != null) {
                                                    fVar = el.l.v(function12, D3, coroutineContext);
                                                }
                                            } else {
                                                throw new IllegalStateException("unexpected".toString());
                                            }
                                        }
                                    }
                                } else {
                                    kVar.a();
                                    this.f34780a = D2;
                                    this.f34781b = null;
                                    bool = Boolean.TRUE;
                                    if (function1 != null) {
                                        fVar = el.l.v(function1, D2, coroutineContext);
                                    }
                                }
                                iVar.m(fVar, bool);
                            }
                            Object p12 = iVar.p();
                            if (p12 == zt.a.f42823a) {
                                Intrinsics.checkNotNullParameter(frame, "frame");
                            }
                            return p12;
                        } catch (Throwable th2) {
                            th = th2;
                            iVar.z();
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        iVar = A;
                    }
                } else {
                    kVar.a();
                    this.f34780a = D;
                    return Boolean.TRUE;
                }
            } else {
                throw new IllegalStateException("unreachable".toString());
            }
        }
    }

    public final Object c() {
        Object obj = this.f34780a;
        kp.g gVar = e.f34810p;
        if (obj != gVar) {
            this.f34780a = gVar;
            if (obj != e.f34806l) {
                return obj;
            }
            Throwable r10 = this.f34782c.r();
            int i10 = a0.f38355a;
            throw r10;
        }
        throw new IllegalStateException("`hasNext()` has not been invoked".toString());
    }
}
