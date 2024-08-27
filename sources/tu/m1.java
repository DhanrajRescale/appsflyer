package tu;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import ut.l;

/* loaded from: classes2.dex */
public final class m1 extends uu.c {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f36503a = new AtomicReference(null);

    @Override // uu.c
    public final boolean a(uu.a aVar) {
        AtomicReference atomicReference = this.f36503a;
        if (atomicReference.get() != null) {
            return false;
        }
        atomicReference.set(l1.f36497a);
        return true;
    }

    @Override // uu.c
    public final yt.a[] b(uu.a aVar) {
        this.f36503a.set(null);
        return uu.b.f37418a;
    }

    public final Object c(j1 frame) {
        qu.i iVar = new qu.i(1, zt.f.b(frame));
        iVar.s();
        AtomicReference atomicReference = this.f36503a;
        kp.g gVar = l1.f36497a;
        while (true) {
            if (atomicReference.compareAndSet(gVar, iVar)) {
                break;
            }
            if (atomicReference.get() != gVar) {
                l.Companion companion = ut.l.INSTANCE;
                iVar.resumeWith(Unit.f23355a);
                break;
            }
        }
        Object p10 = iVar.p();
        zt.a aVar = zt.a.f42823a;
        if (p10 == aVar) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        if (p10 == aVar) {
            return p10;
        }
        return Unit.f23355a;
    }
}
