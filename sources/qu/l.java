package qu;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class l extends p1 {

    /* renamed from: e, reason: collision with root package name */
    public final i f32233e;

    public l(i iVar) {
        this.f32233e = iVar;
    }

    @Override // qu.l1
    public final void e(Throwable th2) {
        x1 k10 = k();
        i iVar = this.f32233e;
        Throwable o10 = iVar.o(k10);
        if (iVar.w()) {
            yt.a aVar = iVar.f32215d;
            Intrinsics.d(aVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            vu.h hVar = (vu.h) aVar;
            loop0: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = vu.h.f38373h;
                Object obj = atomicReferenceFieldUpdater.get(hVar);
                kp.g gVar = vu.i.f38382b;
                if (Intrinsics.a(obj, gVar)) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(hVar, gVar, o10)) {
                        if (atomicReferenceFieldUpdater.get(hVar) != gVar) {
                            break;
                        }
                    }
                    return;
                } else {
                    if (obj instanceof Throwable) {
                        return;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(hVar, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(hVar) != obj) {
                            break;
                        }
                    }
                    break loop0;
                }
            }
        }
        iVar.r(o10);
        if (!iVar.w()) {
            iVar.l();
        }
    }
}
